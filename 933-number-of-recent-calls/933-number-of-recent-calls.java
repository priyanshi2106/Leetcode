class RecentCounter {
LinkedList<Integer> ll;
    public RecentCounter() {
       this.ll = new LinkedList<>();
    }
    
    public int ping(int t) {
        ll.addLast(t);
        while(ll.getFirst() < t-3000){
            ll.removeFirst();
        }
        return ll.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */