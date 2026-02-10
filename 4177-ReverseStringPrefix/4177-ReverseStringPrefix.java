// Last updated: 2/10/2026, 8:47:24 PM
class Solution {
    public String reversePrefix(String s, int k) {
     String duma="";
     //int dum="";
     String s1=s.substring(0,k);
     String s2=s.substring(k);
     int le=s1.length();
        for (int i=le-1;i>=0;i--){
            duma+=s1.charAt(i);
        }
        return duma+s2;
    }
    
}