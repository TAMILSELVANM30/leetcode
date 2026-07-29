// Last updated: 7/29/2026, 10:20:50 AM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int part=s.length()/2;
4        int [] freq=new int [26];
5        for(int i=0;i<part;i++){
6            freq[s.charAt(i)-'a']++;
7
8        }
9        StringBuilder left=new StringBuilder();
10        for(int i=0;i<26;i++){
11        if(freq[i]>0){
12            left.append(String.valueOf((char)('a'+i)).repeat(freq[i]));
13        }
14        }
15        String mid=s.length()%2!=0 ?String.valueOf(s.charAt(part)):"";
16        String right=new StringBuilder(left).reverse().toString();
17
18
19    
20    return left.toString()+mid+right;
21       }
22}