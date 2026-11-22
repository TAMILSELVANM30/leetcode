class Solution {
    public boolean checkString(String s) {
      int n=s.length();
      for(int i =0;i<n-1;i++){
        char c1=s.charAt(i);
        char c2=s.charAt(i+1);
          if(c1=='b' && c2=='a') return false;
      }  
      return true;
    }
}