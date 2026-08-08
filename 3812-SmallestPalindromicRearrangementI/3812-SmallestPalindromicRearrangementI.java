// Last updated: 8/8/2026, 9:50:34 PM
class Solution {
    public String smallestPalindrome(String s) {
        int part=s.length()/2;
        int [] freq=new int [26];
        for(int i=0;i<part;i++){
            freq[s.charAt(i)-'a']++;

        }
        StringBuilder left=new StringBuilder();
        for(int i=0;i<26;i++){
        if(freq[i]>0){
            left.append(String.valueOf((char)('a'+i)).repeat(freq[i]));
        }
        }
        String mid=s.length()%2!=0 ?String.valueOf(s.charAt(part)):"";
        String right=new StringBuilder(left).reverse().toString();


    
    return left.toString()+mid+right;
       }
}