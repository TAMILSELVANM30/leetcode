// Last updated: 7/11/2026, 3:57:46 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s=new HashSet<Integer>();
        for(int i:nums){
            if(!s.contains(i)){
                s.add(i);
            }
            else{
                return true;
            }
            
        }
        return false;
    }
}