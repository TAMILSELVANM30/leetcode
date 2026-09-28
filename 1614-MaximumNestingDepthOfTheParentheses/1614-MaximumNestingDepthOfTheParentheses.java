// Last updated: 9/28/2026, 8:30:58 PM
class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int i=0;
        int ans=0;
        int count=0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='(') {
                count++;
            }
            if(ch==')'){
                count--;
            }
            ans=Math.max(ans,count);
            
            i++;
        }
        return ans;
    }
}