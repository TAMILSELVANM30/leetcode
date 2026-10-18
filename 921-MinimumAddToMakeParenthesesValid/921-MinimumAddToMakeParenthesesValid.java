// Last updated: 10/18/2026, 9:16:15 PM
class Solution {
    public int minAddToMakeValid(String s) {
        int depth=0;
        int n=s.length();
        int answer=0;
       //Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                depth++;
            }
            if(c==')'){
                depth--;
            }
            if(depth<0){
                answer++;
                depth=0;
            }
        }
        int fin_ans=Math.abs(depth-0) + answer;
        return fin_ans;
    }
}