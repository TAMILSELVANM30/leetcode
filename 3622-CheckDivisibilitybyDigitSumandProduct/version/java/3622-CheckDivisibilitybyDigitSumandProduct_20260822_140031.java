// Last updated: 8/22/2026, 2:00:31 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3       return n%see(n)==0? true:false; 
4        
5    }
6    public int see(int n){
7       
8        int sum=0;
9        int product=1;
10        while(n!=0){
11            sum+=n%10;
12            product*=n%10;
13            n/=10;
14        }
15        int fin=sum+product;
16        return fin;
17        
18    }
19}