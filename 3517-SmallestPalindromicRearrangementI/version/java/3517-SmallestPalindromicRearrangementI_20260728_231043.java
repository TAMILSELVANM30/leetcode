// Last updated: 7/28/2026, 11:10:43 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        StringBuilder left= new StringBuilder();
4        
5        int [] freq=new int[26];
6        int le=s.length();
7        for(int i =0;i<le;i++){
8            freq[s.charAt(i)-'a']++;
9        }
10        int leftnum;
11        StringBuilder mid=new StringBuilder();
12        for (int j=0;j<26;j++){
13            if(freq[j]%2!=0){
14                mid.append((char)('a'+j));
15            }
16            leftnum=freq[j]/2;
17            while(leftnum>0){
18                left.append((char)('a'+j));
19                leftnum--;
20            }
21        }
22        
23       
24        return left.toString()+mid.toString()+right(left.toString());
25        
26    }
27    public String right(String left){
28        StringBuilder right=new StringBuilder();
29        int le=left.length();
30        for(int i=le-1;i>=0;i-- ){
31            right.append(left.charAt(i));
32        }
33        return right.toString();
34
35    }
36}