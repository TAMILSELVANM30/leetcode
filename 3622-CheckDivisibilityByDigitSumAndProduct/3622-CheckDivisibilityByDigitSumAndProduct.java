// Last updated: 9/14/2026, 11:54:25 PM
class Solution {
    public boolean checkDivisibility(int n) {
       return n%see(n)==0? true:false; 
        
    }
    public int see(int n){
       
        int sum=0;
        int product=1;
        while(n!=0){
            sum+=n%10;
            product*=n%10;
            n/=10;
        }
        int fin=sum+product;
        return fin;
        
    }
}