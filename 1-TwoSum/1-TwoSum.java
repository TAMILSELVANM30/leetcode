// Last updated: 6/25/2026, 11:33:31 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ha=new HashMap<>();
        int le=nums.length;
        for (int i=0;i<le;i++){
        int cal=target-nums[i];
        if(ha.containsKey(cal)){
            
            return new int[]{ha.get(cal),i};
        }
            ha.put(nums[i],i);
        }
        return null;
        
    }
}