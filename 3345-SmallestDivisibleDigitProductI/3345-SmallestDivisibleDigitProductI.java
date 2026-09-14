// Last updated: 9/14/2026, 11:54:41 PM
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