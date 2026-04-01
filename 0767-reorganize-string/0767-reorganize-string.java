class Solution {
    public String reorganizeString(String s) {

        // O(n) to count frq
        // O(klogk) to perform operations on maxHeap so O(nlogk)
        //calculate the freq
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        pq.addAll(hm.keySet());
        StringBuilder sb = new StringBuilder();
        while (pq.size() > 1) {
            char curr = pq.remove();
            char next = pq.remove();
            sb.append(curr);
            sb.append(next);
            //dec freq
            hm.put(curr, hm.get(curr) - 1);
            hm.put(next, hm.get(next) - 1);

            if (hm.get(curr) > 0) {
                pq.add(curr);
            }
            if (hm.get(next) > 0) {
                pq.add(next);
            }

        }
        if(!pq.isEmpty()){
            char c = pq.remove();
            if(hm.get(c) > 1){
                return "";
            }
            sb.append(c);
        }
        return sb.toString();
    }
}