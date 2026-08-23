// Last updated: 8/23/2026, 9:01:38 AM
1class Solution {
2    public boolean isPalindromic(String s) {
3        String m=bin(s);
4        boolean ans=true;
5        int n=m.length();
6        int i=0,j=n-1;
7        while(i<n&&j>0){
8            if(m.charAt(i)!=m.charAt(j)){
9                ans=false;
10            }
11            
12        i++;
13        j--;
14        }
15        
16        return ans;
17    }
18    public String bin(String s){
19        String n="";
20        for(int i=0;i<s.length();i++){
21         char ch=s.charAt(i);   
22        n=n+String.format("%8s",Integer.toBinaryString(ch)).replace(' ','0'); 
23        }
24        return n;
25    }
26}