// Last updated: 9/14/2026, 11:53:16 PM
class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int ans=0;
        String sub=s;
        for(int i=0;i<n;i++){
            int score=0;
            for(int j=0;j<n-1;j++){
                if(sub.charAt(j)==sub.charAt(j+1)) score++;
            }
            if(score==k) ans++;
            sub=sub.substring(1)+sub.charAt(0);
        }
        return ans;
    }
}