class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        String ans="";
        while(n>k){
        StringBuilder curr=new StringBuilder();
            for (int i=0;i<n;i+=k){
                String freq=s.substring(i,Math.min(i+k,n)); //taked as seperated values by k 
                curr.append(freq.chars().map(c->c-'0').sum()); //added 
             }
             s=curr.toString();
             n=s.length();
        ans=curr.toString();
         }
         return ans;
    }
}