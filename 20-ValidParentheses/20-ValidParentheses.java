// Last updated: 10/5/2026, 9:40:49 PM
class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        boolean ans=true;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch=='['|| ch=='{'){
                st.push(ch);
            }
            if(st.isEmpty()) return false;
            if(ch==')' && st.pop()!='(' || ch=='}' && st.pop()!='{' || ch==']' && st.pop()!='['){
                ans=false;
            }
           
        }
        if(!st.isEmpty()) return false;
        return ans;
    }
}