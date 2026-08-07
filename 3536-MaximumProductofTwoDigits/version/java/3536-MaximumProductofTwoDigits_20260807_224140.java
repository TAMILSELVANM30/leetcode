// Last updated: 8/7/2026, 10:41:40 PM
1class Solution {
2    public int maxProduct(int n) {
3        return product(n);
4        
5    }
6    public int product(int n){
7        int le=(int)Math.log10(n)+1;
8        int[] arr=new int[le];
9        int i=0;
10        while(n!=0){
11            arr[i++]=n%10;
12            n=n/10;
13        }
14        Arrays.sort(arr);
15        return arr[le-1]*arr[le-2];
16
17    }
18}