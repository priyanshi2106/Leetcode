class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();
        int indegree[] = new int[numCourses];

        for(int edge[] : prerequisites){
            int src = edge[1];
            int dest = edge[0];
            adjList.putIfAbsent(src, new ArrayList<>());
            adjList.get(src).add(dest);
            indegree[dest]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int count = 0;

        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            //check neighbors
            if(!adjList.containsKey(node)){
                continue;
            }
            for(int neighbor : adjList.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0){
                    q.add(neighbor);
                }
            }
        }
        return count == numCourses;
    }
}