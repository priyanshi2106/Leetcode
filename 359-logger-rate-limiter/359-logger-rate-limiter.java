class Logger {
HashMap<String, Integer> hm;
    public Logger() {
        this.hm = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!hm.containsKey(message)){
            hm.put(message,timestamp);
            return true;
        }
        int oldTimestamp = hm.get(message);
        if(timestamp-oldTimestamp>=10 ){
            hm.put(message,timestamp);
                return true;
            }
        
       else{
           return false;
       }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */