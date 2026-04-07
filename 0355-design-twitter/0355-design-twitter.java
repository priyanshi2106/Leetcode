class Twitter {
    int timestamp = 0;
    HashMap<Integer, Set<Integer>> followees;
    HashMap<Integer, List<Tweet>> tweets;

    class Tweet {
        int tweetId;
        int timeStamp;
        public Tweet(int tweetId, int timeStamp){
            this.tweetId = tweetId;
            this.timeStamp = timeStamp;
        }
    }

    public Twitter() {
        followees = new HashMap<>();
        tweets = new HashMap<>();
        
    }
    
    public void postTweet(int userId, int tweetId) {
        //check if this user already has posted tweets or not - if not create new entry
        if(!tweets.containsKey(userId)){
            tweets.put(userId, new ArrayList<>());
        }
        Tweet newTweet = new Tweet(tweetId, timestamp++);
        tweets.get(userId).add(newTweet);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a,b)-> b.timeStamp-a.timeStamp);
        List<Integer> ans = new ArrayList<>();
        //get list of followers
        //loop through followers to get the tweets and push it in pq
        //at any time pq.size() > 10 we stop

        List<Integer> userIds = new ArrayList<>();
        userIds.add(userId);
        if(followees.containsKey(userId)){
            userIds.addAll(followees.get(userId));
        }

        for(Integer user: userIds){
            if(tweets.containsKey(user)){
                //get the tweets of each user
                List<Tweet> twee = tweets.get(user);
                int size = twee.size();
                for(int i = size - 1; i >= Math.max(0, size - 10); i--){
                    pq.add(twee.get(i));

                }
            }

        }
        while(!pq.isEmpty() && ans.size() < 10){
        ans.add(pq.poll().tweetId);
    }
        //Collections.reverse(ans);

        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        //can't follow yourself
        if(followerId == followeeId){
            return;
        }
        if(!followees.containsKey(followerId)){
            followees.put(followerId, new HashSet<>());
        }
        followees.get(followerId).add(followeeId);
        
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followeeId == followerId) return;
        if(followees.containsKey(followerId)){
            followees.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */