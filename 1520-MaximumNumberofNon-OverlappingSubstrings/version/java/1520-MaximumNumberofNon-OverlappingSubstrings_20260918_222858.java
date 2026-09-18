// Last updated: 9/18/2026, 10:28:58 PM
1class Solution {
2    public List<String> maxNumOfSubstrings(String s) {
3     int n=s.length();
4     int f=0,r=0;
5     int [] first=new  int[26];
6     int [] last=new int[26];
7     Arrays.fill(first,-1);
8     Arrays.fill(last,-1);
9     List<String> ans=new ArrayList<>();
10     List<int[]> intervals=new ArrayList<>();
11     for(int i=0;i<n;i++){
12        int index=s.charAt(i)-'a';
13        if(first[index]==-1){
14        first[index]=i;
15        }
16        last[index]=i;
17   }
18  
19   for(int i=0;i<26;i++){
20    if(first[i]!=-1 && last[i]!=-1){
21     f=first[i];
22     r=last[i];
23   
24       String a=NON(n,f,r,s,first,last);
25     if(a!=null) intervals.add(new int[]{f,f+a.length()-1});
26    }
27   }
28   int prevEnd=-1;
29   intervals.sort((x,y)->Integer.compare(x[1],y[1]));
30   for(int[] interval : intervals) {
31    int start=interval[0];
32    int end=interval[1];
33
34    if(start > prevEnd) {
35        ans.add(s.substring(start,end+1));
36        prevEnd=end;
37    }
38}
39    return ans;
40 }
41public static String NON (int n,int f,int r,String s,int[] first,int[] last){
42        
43        int start=f,end=r;
44
45        for(int i=f;i<=r;i++){
46                char c=s.charAt(i);
47                int index=c-'a';
48                if(first[index]<f) return null;
49                if(last[index]>r){
50                    r=last[index];
51                   end=r;  //expanding 
52                }
53
54        }
55        return s.substring(start,end+1);
56    }
57}