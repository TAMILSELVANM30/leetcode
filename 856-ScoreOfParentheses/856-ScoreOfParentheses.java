// Last updated: 10/5/2026, 9:39:55 PM
class Solution {
    public int scoreOfParentheses(String s) {
        int depth=0;
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                depth++;
            }
            if(c==')'){
                if(s.charAt(i-1)=='('){
                res+=(int) Math.pow(2,depth);
                }
                depth--;
            }
        }
        return res/2;
    }
}