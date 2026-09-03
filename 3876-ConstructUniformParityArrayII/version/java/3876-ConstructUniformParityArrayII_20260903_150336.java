// Last updated: 9/3/2026, 3:03:36 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int le =nums1.length;
4        int small=Integer.MAX_VALUE;
5        for(int num:nums1){
6            small=Math.min(small,num);
7        }
8        boolean flag=true;
9        for(int i=0;i<le;i++){
10            if(small==nums1[i]){
11                continue; 
12            }
13        if(oddeven(small)==0 && oddeven(nums1[i])==0 ) flag=true;
14        if(oddeven(small)==1 && oddeven(nums1[i])==0 ) flag=true;
15        if(oddeven(small)==1 && oddeven(nums1[i])==1 ) flag=true;
16        if(oddeven(small)==0 && oddeven(nums1[i])==1 ){
17          flag=false;
18          break;  
19        } 
20        }
21        return flag==true?true:false;
22    }
23    public static int oddeven(int n){
24         if(n%2==0){
25            return 0;
26         }
27         return 1;
28    }
29}