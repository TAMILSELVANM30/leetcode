class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
      
        long requirement=Math.max(need1, need2);
        long overlap= Math.min(need1, need2); //overlapped and match with COSTBOTH 

        long cost=cost1+cost2; //very small than both na no exception  
        if(costBoth>=cost){
           
        return (long) cost1*need1 + (long)cost2*need2;
        }else{
            long first=overlap* costBoth;
            if(need1>need2){
                return (long) Math.min((long)cost1*(need1-overlap),(long)costBoth*(need1-overlap)) +first;
            }else{
                return (long) Math.min((long)cost2*(need2-overlap),(long)costBoth*(need2-overlap)) +first;
            }

        }
    }
   
}