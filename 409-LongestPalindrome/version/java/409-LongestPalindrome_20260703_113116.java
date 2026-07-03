// Last updated: 7/3/2026, 11:31:16 AM
1class Solution {
2    public int longestPalindrome(String s) {
3        HashMap<Character, Integer> map=new HashMap<>();
4        for(char c:s.toCharArray()){
5            map.put(c,map.getOrDefault(c,0)+1);
6        }
7        int ans=0;
8        boolean hasodd=false;
9        for(int val:map.values()){
10            if(val%2==0){
11                ans+=val;
12            }else{
13                ans+=val-1;
14                hasodd=true;
15            }
16             
17        }
18        if(hasodd){
19                ans+=1;
20            }
21        return ans;
22    }
23}