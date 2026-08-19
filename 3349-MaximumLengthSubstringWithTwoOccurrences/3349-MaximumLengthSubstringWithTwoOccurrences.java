// Last updated: 8/19/2026, 8:53:28 PM
class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int left=0;
        int res=0;
        int ans=0;
        int [] freq=new int[26];
        for(int i=0;i<n;i++){
            int e=s.charAt(i);
            freq[e-'a']++;
            while(freq[e-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            if(freq[e-'a']<=2){
                res=i-left+1;
                ans=Math.max(res,ans);
            }
        }
        return ans;
    }
}