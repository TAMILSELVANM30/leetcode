// Last updated: 9/14/2026, 11:55:04 PM
class Solution {
    public int minimumPushes(String word) {
        int le=word.length();
        int count=0;

        for(int i=0;i<le;i++){
            count +=(i>>3)+1;

        }
        return count;
        
    }
}