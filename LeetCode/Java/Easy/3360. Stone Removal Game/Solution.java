class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        n=n-10;
        if(n%2==0) return true;
        return false;
    }
}