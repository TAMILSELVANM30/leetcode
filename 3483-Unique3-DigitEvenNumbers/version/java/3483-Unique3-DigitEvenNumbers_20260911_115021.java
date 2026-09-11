// Last updated: 9/11/2026, 11:50:21 AM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        int n=digits.length;
4        HashSet<Integer> ans=new HashSet<>();
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                for(int k=0;k<n;k++){
8                    if(i==j||j==k||i==k) continue;
9                    int num=(digits[i]*100)+(digits[j]*10)+ digits[k];
10                    if(num%2==0 && num>99) ans.add(num);
11                    
12                }
13            }
14        }
15        return ans.size();
16    }
17}