// Last updated: 7/11/2026, 3:58:10 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int ori=x,rev=0;
        while(x>0){

            rev=rev*10+(x%10);
           x= x/10;
        }
        return ori==rev;
    }

    
}