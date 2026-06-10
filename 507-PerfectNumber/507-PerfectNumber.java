// Last updated: 6/11/2026, 1:30:28 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int n=0;
        for(int i=1;i<num-1;i++){
            if (num%i==0){
              n+=i;
              }
            }
             
           if (n==num)
            return true;
           else
            return false;
    }
}