// Last updated: 2/22/2026, 9:32:21 AM
1class Solution {
2    public int scoreDifference(int[] nums) {
3      boolean firstact=true;
4
5      int le=nums.length;
6      int p1=0;
7      int p2=0;
8        for (int i =0;i<le;i++){
9        if (((i+1)%6)==0){//In every 6th game the active and inactive players swap roles
10            firstact=!firstact;
11            //p2+=nums[i]-nums[]
12        }if (nums[i]%2!=0){//If nums[i] is odd, the active and inactive players swap roles.
13            firstact=!firstact;
14            
15        }if(firstact){
16            p1+=nums[i];
17            
18        }else{
19            p2+=nums[i];
20        }
21       // return p1-p2 ;   
22      }
23    return p1-p2 ; 
24    }
25}