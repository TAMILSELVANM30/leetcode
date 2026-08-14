// Last updated: 8/14/2026, 12:39:33 PM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int n=s.length();
4        int left=0;
5        int res=0;
6        int ans=0;
7        int [] freq=new int[26];
8        for(int i=0;i<n;i++){
9            int e=s.charAt(i);
10            freq[e-'a']++;
11            while(freq[e-'a']>2){
12                freq[s.charAt(left)-'a']--;
13                left++;
14            }
15            if(freq[e-'a']<=2){
16                res=i-left+1;
17                ans=Math.max(res,ans);
18            }
19        }
20        return ans;
21    }
22}