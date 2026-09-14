// Last updated: 9/14/2026, 11:55:13 PM
class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        return sub(s,k);
    }
    public static  String sub(String s, int k){
        int n=s.length();
        int mini=Integer.MAX_VALUE;
        String finans="";
       
        for(int i=0;i<n;i++){
            int count=0;
             String ans="";
            for(int j=i;j<n;j++){

                if(s.charAt(j)=='1'){
                        count++;
                }
                if(count==k){
                        ans=s.substring(i,j+1);
                        break;
                }
                
            }
            if(!ans.equals("")&&mini>ans.length()||ans.length()==finans.length()&& ans.compareTo(finans)<0){
                mini=ans.length();
                finans=ans;
                //ans="";
            }
        }
        return finans;
    }
}