// Last updated: 8/8/2026, 9:50:25 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int le=nums.length;
        List<Integer> list=new ArrayList<>();
        int min=nums[0], max=nums[0];
        for(int i :nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        int[] arr= new int[max+1];
        for(int i=0;i<le;i++){
            arr[nums[i]]++;
        }
        for(int i=min;i<max;i++){
            if(arr[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}