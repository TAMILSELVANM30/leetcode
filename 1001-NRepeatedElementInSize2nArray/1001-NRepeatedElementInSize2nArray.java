// Last updated: 2/10/2026, 8:47:47 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i :nums){
        if (!set.add(i)){
            return i;
        }
        }
    return 0;
    }
}