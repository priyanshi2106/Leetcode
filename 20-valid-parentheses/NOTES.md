Stack<Character> st = new Stack<>();
//check while adding char to stack
for (char c : s.toCharArray()) {
if (c == '(')
st.push(')');
else if (c == '{')
st.push('}');
else if (c == '[')
st.push(']');
else if (st.isEmpty() || st.pop() != c)
return false;
}
return st.isEmpty();