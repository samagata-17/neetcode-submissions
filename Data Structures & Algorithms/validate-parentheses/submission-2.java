class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                st.push(c);
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                char old = st.pop();
                if(c == ')' && old == '('){
                    continue;
                }
                else if( c == '}' &&  old == '{'){
                    continue;
                }
                else if( c == ']' && old == '['){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
