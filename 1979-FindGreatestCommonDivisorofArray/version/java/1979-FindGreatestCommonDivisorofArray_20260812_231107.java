// Last updated: 8/12/2026, 11:11:07 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int le=nums.length;
4         int min=nums[0];
5         int max=nums[0];
6        for(int i =0;i<le;i++){
7            if(nums[i]<min){
8                min=nums[i];
9            }if(nums[i]>max){
10                max=nums[i];
11            }
12        }
13            return gcd(min,max);
14    }
15public int gcd(int a, int b){
16    while(b!=0){
17        int temp=b;
18        b=a%b;
19        a=temp;
20    }
21    return a;
22
23    }
24}