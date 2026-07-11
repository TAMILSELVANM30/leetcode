// Last updated: 7/11/2026, 3:57:44 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int le=nums.length;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<le;i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i],i);
            }else{
                if(Math.abs(i-m.get(nums[i]))<=k){
                    return true;
                }else{
                    m.put(nums[i],i);
                }
            }
        }
        System.gc();
        return false;
    }
}