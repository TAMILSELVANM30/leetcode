// Last updated: 9/14/2026, 11:54:35 PM
class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||j==k||i==k) continue;
                    int num=(digits[i]*100)+(digits[j]*10)+ digits[k];
                    if(num%2==0 && num>99) ans.add(num);
                    
                }
            }
        }
        return ans.size();
    }
}