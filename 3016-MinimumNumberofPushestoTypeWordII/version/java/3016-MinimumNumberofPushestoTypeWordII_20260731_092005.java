// Last updated: 7/31/2026, 9:20:05 AM
1class Solution {
2    public int minimumPushes(String word) {
3        int count=0,ans=0;
4        int [] arr=new int[26];
5        int le=word.length();
6        for(int i =0;i<le;i++){
7            arr[word.charAt(i)-'a']++;
8        }
9        Arrays.sort(arr);
10        System.gc();
11        return minpush(arr,count,ans);
12
13        
14    }
15    public int minpush(int[] arr,int count,int ans){
16        int mul=0;
17        for(int i=25;i>=0;i--){
18            count=(mul>>3)+1;
19            ans+=count*arr[i];
20            mul++;
21        }
22        return ans;
23    }
24}