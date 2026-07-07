// Last updated: 7/7/2026, 10:25:23 PM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans=0;
        boolean hasodd=false;
        for(int val:map.values()){
            if(val%2==0){
                ans+=val;
            }else{
                ans+=val-1;
                hasodd=true;
            }
             
        }
        if(hasodd){
                ans+=1;
            }
        return ans;
    }
}