class Solution {
    public String destCity(List<List<String>> paths) {
        if(paths == null || paths.size() == 0){
            return "";
        }
        HashMap<String, String> hm = new HashMap<>();
        //adding keys and values into the hashMap
        for(List<String> path: paths){
         hm.put(path.get(0), path.get(1));
        }
        //checking for the cities against values in the hashMaps
        for(String city: hm.values()){
            if(!hm.containsKey(city)){
                return city;
            }
        }
        return "";
        
    }
}