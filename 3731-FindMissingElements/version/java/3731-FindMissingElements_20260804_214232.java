// Last updated: 8/4/2026, 9:42:32 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int le=nums.length;
4        List<Integer> list=new ArrayList<>();
5        int min=nums[0], max=nums[0];
6        for(int i :nums){
7            min=Math.min(i,min);
8            max=Math.max(i,max);
9        }
10        int[] arr= new int[max+1];
11        for(int i=0;i<le;i++){
12            arr[nums[i]]++;
13        }
14        for(int i=min;i<max;i++){
15            if(arr[i]==0){
16                list.add(i);
17            }
18        }
19        return list;
20    }
21}