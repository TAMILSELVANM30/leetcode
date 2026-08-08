// Last updated: 8/8/2026, 9:50:26 PM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=n*n;
        int sumeven=n*n+n;
        return GCD(sumodd,sumeven);
        
    }
    public int GCD(int sumodd,int sumeven){
        if(sumeven==0){
            return sumodd;
        }
        return GCD(sumeven, sumodd % sumeven);
    }
}