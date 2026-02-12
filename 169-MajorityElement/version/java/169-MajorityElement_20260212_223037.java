// Last updated: 2/12/2026, 10:30:37 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3    int  count=0;
4    int le=nums.length;
5    int canditate=0;
6    for(int current =0;current<le;current++){
7        if (count ==0){
8            canditate=nums[current];
9        }if (canditate==nums[current]){
10            count++;
11        }else{
12            count--;
13         }
14       
15    }
16    return canditate;
17    
18    }
19}