class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       HashMap<Integer, List<Integer>> adjList = new HashMap<>();
        int indegre[] = new int[numCourses];
        for(int[] edge: prerequisites){
            int src = edge[1];
            int dest = edge[0];
            adjList.putIfAbsent(src, new ArrayList<>());
            adjList.get(src).add(dest);
            indegre[dest]++;
        }
        //add all 0 indegrees to queue
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegre[i] == 0){
                q.add(i);
            }
        }
        int count = 0;
        //count is inc by 1 everytimewe pop a node out of a queue and its indegree is 0
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            if(!adjList.containsKey(node)){
                continue;
            }
                //check neighbors
                for(int neighbor: adjList.get(node)){
                    indegre[neighbor]--;
                    if(indegre[neighbor] == 0){
                        q.add(neighbor);
                    }
                }
            
        }
        return count == numCourses;


    }
}