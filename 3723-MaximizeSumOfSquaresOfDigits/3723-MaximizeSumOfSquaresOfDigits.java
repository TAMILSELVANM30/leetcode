// Last updated: 10/18/2026, 9:14:38 PM
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>num*9){
       return "";     
        }
      StringBuilder ans=new StringBuilder();
       
        while(sum>0){
            if(sum>9){
                ans.append("9");
            }
            else{
                ans.append(sum);
            }
            sum=sum-9;
        }
       int ansle=ans.length();
        int y=num-ansle;
       ans.append("0".repeat(y));
        return ans.toString();

    }
}