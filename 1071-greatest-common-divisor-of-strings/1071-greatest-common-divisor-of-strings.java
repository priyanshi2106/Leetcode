class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        for(int i = Math.min(l1,l2); i > 0; i--) {
            if(isValidSubstring(str1, str2, i)) {
                return str1.substring(0, i);
            }
        }
        return "";
    }
    public boolean isValidSubstring(String str1, String str2, int k) {
        int l1 = str1.length();
        int l2 = str2.length();
        if(l1%k != 0 || l2%k != 0){
            return false;
        }
        else{
            String base = str1.substring(0, k);
            return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
        }
            
    }
}