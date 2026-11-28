class Solution {
    public boolean canAliceWin(int n) {
        
        int count=0;
        int m=9;
        while(n>=10){
            count++;
            n=n-m;
            m--;

        }
        if(count%2==0) return false;
        return true;
    }
}