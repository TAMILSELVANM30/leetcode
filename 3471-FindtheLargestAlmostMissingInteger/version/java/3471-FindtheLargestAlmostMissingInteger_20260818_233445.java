// Last updated: 8/18/2026, 11:34:45 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int n=nums.length;
4        int i=0,end=n-k+1;
5        HashMap<Integer,Integer> map=new HashMap<>();
6        int answer=-1;
7
8        while(i<end){
9            HashSet<Integer> set= new HashSet<>();
10            for(int j=i;j<i+k;j++){
11                set.add(nums[j]);
12            }
13            for(int m:set){
14                map.put(m,map.getOrDefault(m,0)+1);
15            }
16            i++;
17        }
18        for(Map.Entry<Integer,Integer> m:map.entrySet()){
19            if(m.getValue()==1){
20                answer=Math.max(answer,m.getKey());
21            }
22          
23        }
24        return answer;
25        
26    }
27}