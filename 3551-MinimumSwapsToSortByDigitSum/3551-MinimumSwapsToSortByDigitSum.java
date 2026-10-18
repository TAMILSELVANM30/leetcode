// Last updated: 10/18/2026, 9:14:53 PM
class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        ArrayList<int[]> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new int []{
                nums[i],
                digSum(nums[i]),
                i
            });
        }
        arr.sort((a, b) ->{
        if(a[1]!=b[1]){
           return  Integer.compare(a[1],b[1]);
        }
        return Integer.compare(a[0],b[0]);
    });
        boolean[] visit=new boolean[n];
       int  swaps=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)[2]==i || visit[i]) continue;
            int j=i;
           int  cycle=0;
            while(!visit[j]){
                visit[j]=true;
                j = arr.get(j)[2];
                cycle++;
            }
            swaps+=cycle-1;
        }
        return swaps;

    }



private int digSum(int num){
        int sum = 0;

        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}