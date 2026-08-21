// Last updated: 8/21/2026, 10:14:25 PM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        int n =nums.length;
4       
5        int[] arr1=new int [n];
6        int[] arr2=new int [n];
7        arr1[0]=nums[0];
8        arr2[0]=nums[1];
9        int a=1;
10        int b=1;
11        for(int i=2;i<n;i++){
12
13        if(arr1[a-1]>arr2[b-1]){
14            arr1[a]=nums[i];
15            a++;
16        }else{
17            arr2[b]=nums[i];
18            b++;
19        }
20        
21        }
22        for(int j=0;j<b;j++){
23            arr1[a]=arr2[j];
24            a++;
25        }
26        return arr1;
27    }
28}