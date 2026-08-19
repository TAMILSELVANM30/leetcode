// Last updated: 8/19/2026, 8:53:20 PM
class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int i=0,end=n-k+1;
        HashMap<Integer,Integer> map=new HashMap<>();
        int answer=-1;

        while(i<end){
            HashSet<Integer> set= new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(nums[j]);
            }
            for(int m:set){
                map.put(m,map.getOrDefault(m,0)+1);
            }
            i++;
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1){
                answer=Math.max(answer,m.getKey());
            }
          
        }
        return answer;
        
    }
}