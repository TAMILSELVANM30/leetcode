// Last updated: 8/21/2026, 10:30:14 PM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        int n=nums.length;
4        int[] arr1=new int[n];
5        int [] arr2=new int [n-1];
6        int a=0;
7        int b=0;
8        arr1[0]=nums[0];
9        arr2[0]=nums[1];
10        for(int i=2;i<n;i++){
11            if(arr1[a]>arr2[b]){
12                arr1[++a]=nums[i];
13            }else{
14                arr2[++b]=nums[i];
15            }
16        }
17        for(int j=0;j<b+1;j++){
18                arr1[++a]=arr2[j];
19            }
20           
21            return arr1;
22    }
23}