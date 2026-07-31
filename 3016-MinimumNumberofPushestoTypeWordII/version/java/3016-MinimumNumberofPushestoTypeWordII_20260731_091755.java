// Last updated: 7/31/2026, 9:17:55 AM
1class Solution {
2    public int minimumPushes(String word) {
3        int count=0,ans=0;
4        int [] arr=new int[26];
5        int le=word.length();
6        for(int i =0;i<le;i++){
7            arr[word.charAt(i)-'a']++;
8        }
9        Arrays.sort(arr);
10        return minpush(arr,count,ans);
11
12        
13    }
14    public int minpush(int[] arr,int count,int ans){
15        int mul=0;
16        for(int i=25;i>=0;i--){
17            count=(mul>>3)+1;
18            ans+=count*arr[i];
19            mul++;
20        }
21        return ans;
22    }
23}