// Last updated: 8/25/2026, 8:08:47 PM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet s= new HashSet<>();
        int n=nums.length;
        for(int i:nums){
            s.add(i);
        }
       
        int mini=1;
      
        while((mini%k!=0)|| (s.contains(mini))){
                
                mini++;

        }
        
        
        return mini;
    }
}