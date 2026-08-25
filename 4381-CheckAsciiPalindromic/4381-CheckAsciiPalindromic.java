// Last updated: 8/25/2026, 8:08:27 PM
class Solution {
    public boolean isPalindromic(String s) {
        String m=bin(s);
        boolean ans=true;
        int n=m.length();
        int i=0,j=n-1;
        while(i<n&&j>0){
            if(m.charAt(i)!=m.charAt(j)){
                ans=false;
            }
            
        i++;
        j--;
        }
        
        return ans;
    }
    public String bin(String s){
        String n="";
        for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);   
        n=n+String.format("%8s",Integer.toBinaryString(ch)).replace(' ','0'); 
        }
        return n;
    }
}