// Last updated: 8/24/2026, 10:18:59 PM
1class Solution {
2    public String addBinary(String a, String b) {
3       int a_len=a.length(),b_len=b.length();
4       StringBuilder s=new StringBuilder();
5        int i=a_len-1,j=b_len-1;
6        int carry=0;
7        int sum=0;
8        while(i>=0 && j>=0){
9          sum=(a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
10          s.append(sum%2);
11          carry=sum/2;
12          i--;
13          j--;
14        }
15         
16        while(i>=0){
17            sum=(a.charAt(i)-'0')+carry;
18            s.append(sum%2);
19            carry=sum/2;
20            i--;
21        }
22        
23        while(j>=0){
24            sum=(b.charAt(j)-'0')+carry;
25            s.append(sum%2);
26            carry=sum/2;
27            j--;
28
29        }
30         while(carry!=0){
31            s.append(carry%2);
32            carry = carry / 2;
33        }
34      
35      
36        return s.reverse().toString();
37    }
38}