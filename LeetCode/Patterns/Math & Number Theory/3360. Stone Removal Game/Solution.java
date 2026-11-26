class Solution {
    public boolean canAliceWin(int n) {
        int m=10;
        
        int count=0;
        while(n>=10){
            count++;
            n=n-(m-1);

        }
        if(count%2==0) return false;
        return true;
    }
}