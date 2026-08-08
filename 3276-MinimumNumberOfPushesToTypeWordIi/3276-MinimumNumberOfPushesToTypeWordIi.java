// Last updated: 8/8/2026, 9:50:48 PM
class Solution {
    public int minimumPushes(String word) {
        int count=0,ans=0;
        int [] arr=new int[26];
        int le=word.length();
        for(int i =0;i<le;i++){
            arr[word.charAt(i)-'a']++;
        }
        Arrays.sort(arr);
        
        return minpush(arr,count,ans);

        
    }
    public int minpush(int[] arr,int count,int ans){
        int mul=0;
        for(int i=25;i>=0;i--){
            count=(mul>>3)+1;
            ans+=count*arr[i];
            mul++;
        }
        return ans;
    }
}