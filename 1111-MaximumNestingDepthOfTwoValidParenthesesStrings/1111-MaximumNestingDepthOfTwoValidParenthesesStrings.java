// Last updated: 10/5/2026, 9:39:42 PM
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int[] ans=new int[n];
        int depth=0;
        for(int i=0;i<n;i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                ans[i]=depth%2;
                depth++;
            }
            if(ch==')'){
                depth--;
                ans[i]=depth%2;
            }
        }
        return ans;
    }
}