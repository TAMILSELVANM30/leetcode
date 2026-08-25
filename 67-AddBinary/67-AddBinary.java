// Last updated: 8/25/2026, 8:10:09 PM
class Solution {
    public String addBinary(String a, String b) {
       int a_len=a.length(),b_len=b.length();
       StringBuilder s=new StringBuilder();
        int i=a_len-1,j=b_len-1;
        int carry=0;
        int sum=0;
        while(i>=0 && j>=0){
          sum=(a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
          s.append(sum%2);
          carry=sum/2;
          i--;
          j--;
        }
         
        while(i>=0){
            sum=(a.charAt(i)-'0')+carry;
            s.append(sum%2);
            carry=sum/2;
            i--;
        }
        
        while(j>=0){
            sum=(b.charAt(j)-'0')+carry;
            s.append(sum%2);
            carry=sum/2;
            j--;

        }
         while(carry!=0){
            s.append(carry%2);
            carry = carry / 2;
        }
      
      
        return s.reverse().toString();
    }
}