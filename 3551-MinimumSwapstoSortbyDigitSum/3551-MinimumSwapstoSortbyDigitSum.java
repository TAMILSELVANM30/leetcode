// Last updated: 10/17/2026, 11:31:49 PM
1class Solution {
2    public int minSwaps(int[] nums) {
3        int n=nums.length;
4        ArrayList<int[]> arr=new ArrayList<>();
5        for(int i=0;i<n;i++){
6            arr.add(new int []{
7                nums[i],
8                digSum(nums[i]),
9                i
10            });
11        }
12        arr.sort((a, b) ->{
13        if(a[1]!=b[1]){
14           return  Integer.compare(a[1],b[1]);
15        }
16        return Integer.compare(a[0],b[0]);
17    });
18        boolean[] visit=new boolean[n];
19       int  swaps=0;
20        for(int i=0;i<n;i++){
21            if(arr.get(i)[2]==i || visit[i]) continue;
22            int j=i;
23           int  cycle=0;
24            while(!visit[j]){
25                visit[j]=true;
26                j = arr.get(j)[2];
27                cycle++;
28            }
29            swaps+=cycle-1;
30        }
31        return swaps;
32
33    }
34
35
36
37private int digSum(int num){
38        int sum = 0;
39
40        while(num > 0){
41            sum += num % 10;
42            num /= 10;
43        }
44        return sum;
45    }
46}