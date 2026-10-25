// Last updated: 10/25/2026, 11:17:46 PM
class Solution {
    public int calculateScore(int a, int b) {
        int s1=jailer(a);
        int s2=jailer(b);
        if(s1>=s2) return s1*s2;
        return s2/s1;
    }

    
    public static int jailer(int x){
        return Integer.bitCount(x);
    }
}