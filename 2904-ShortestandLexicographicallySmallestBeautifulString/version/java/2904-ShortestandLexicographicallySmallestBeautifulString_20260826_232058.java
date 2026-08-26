// Last updated: 8/26/2026, 11:20:58 PM
1class Solution {
2    public String shortestBeautifulSubstring(String s, int k) {
3        return sub(s,k);
4    }
5    public static  String sub(String s, int k){
6        int n=s.length();
7        int mini=Integer.MAX_VALUE;
8        String finans="";
9       
10        for(int i=0;i<n;i++){
11            int count=0;
12             String ans="";
13            for(int j=i;j<n;j++){
14
15                if(s.charAt(j)=='1'){
16                        count++;
17                }
18                if(count==k){
19                        ans=s.substring(i,j+1);
20                        break;
21                }
22                
23            }
24            if(!ans.equals("")&&mini>ans.length()||ans.length()==finans.length()&& ans.compareTo(finans)<0){
25                mini=ans.length();
26                finans=ans;
27                //ans="";
28            }
29        }
30        return finans;
31    }
32}