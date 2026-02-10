// Last updated: 2/10/2026, 8:47:56 PM
class Solution {
    public int climbStairs(int n) {
        int []st=new int [n+1];
        if(n==1||n==2||n==3){
           return n;
        }else if(n>3) {
            st[0]=0;
            st[1]=1;
            st[2]=2;
            
            for (int i=3;i<=n;i++){
                st[i]=st[i-1]+st[i-2];
            }
            return st[n];
        }
    return n;    
    }
}