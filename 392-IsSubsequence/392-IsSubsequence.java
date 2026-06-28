// Last updated: 6/28/2026, 11:36:29 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(j<t.length()){
            if(s.length()==i){
                return true;
            }
           
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }}
        if(i==s.length()){
        return true;}
        else{
            return false;}
    }
}