class MovingAverage {
Deque q = new ArrayDeque<>();
    int count = 0;
    int size,sum = 0;
    public MovingAverage(int size) {
       this.size = size;
    }
    
    public double next(int val) {
        ++count;
       q.add(val);
        
        int tail = count > size ? (int)q.poll():0;
        sum = sum - tail + val;
        return sum*1.0/Math.min(size,count);
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */