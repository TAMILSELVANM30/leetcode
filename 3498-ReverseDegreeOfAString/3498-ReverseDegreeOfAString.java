// Last updated: 9/25/2026, 8:45:09 PM
class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int  ch=s.charAt(i)-'a';
             sum+=(26-ch)*(i+1);

        }
        return sum;
    }
}