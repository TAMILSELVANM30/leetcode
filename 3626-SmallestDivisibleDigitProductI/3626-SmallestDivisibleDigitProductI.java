// Last updated: 8/8/2026, 9:50:38 PM
class Solution {
    public int smallestNumber(int n, int t) {
        int mul=1,ans=0;
      
      
      for(int i=n;i<101;i++){
        int m= multiply(mul,i);
        if(m%t==0){
            ans=i;
            break;
        }
      }
      return ans;
       
    }
    public int multiply(int mul,int n){
        while(n!=0){

        mul*=n%10;
        n=n/10;
        }
        return mul;

    }
}