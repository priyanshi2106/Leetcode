// Backtracking
// Edge case
if(s == null || s.length() == 0) return new ArrayList<>();
List<List<String>> result = new ArrayList<>();
helper(s, new ArrayList<>(), result);
return result;
}
public void helper(String s, List<String> step, List<List<String>> result) {
// Base case
if(s == null || s.length() == 0) {
result.add(new ArrayList<>(step));
return;
}
for(int i = 1; i <= s.length(); i++) {
String temp = s.substring(0, i);
if(!isPalindrome(temp)) continue; // only do backtracking when current string is palindrome
step.add(temp);  // choose
helper(s.substring(i, s.length()), step, result); // explore
step.remove(step.size() - 1); // unchoose
}
return;
}