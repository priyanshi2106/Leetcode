class Solution {
    public String reorganizeString(String s) {

        // O(n) to count frq
        // O(klogk) to perform operations on maxHeap so O(nlogk)
        //calculate the freq
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        //create a priority queue
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> count.get(b) - count.get(a));
        maxHeap.addAll(count.keySet());

        StringBuilder sb = new StringBuilder();
        while (maxHeap.size() > 1) {
            char curr = maxHeap.remove();
            char next = maxHeap.remove();
            sb.append(curr);
            sb.append(next);
            //dec the freq of these char from the hashmap
            count.put(curr, count.get(curr) - 1);
            count.put(next, count.get(next) - 1);
            //if we still have freq more than 0m we add it back to heap to take care we add all the freq and place them one after another
            if (count.get(curr) > 0) {
                maxHeap.add(curr);
            }
            if (count.get(next) > 0) {
                maxHeap.add(next);
            }

        }
        if (!maxHeap.isEmpty()) {
            //we only have one char in heap
            char last = maxHeap.remove();
            if (count.get(last) > 1) {
                return "";
            }
            sb.append(last);
        }
        return sb.toString();
    }
}