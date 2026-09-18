// Last updated: 9/18/2026, 10:28:36 PM
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
28   intervals.sort((x,y)->{
29    if(x[1]==y[1]) {
30        return Integer.compare(x[0],y[0]);
31    }
32    return Integer.compare(x[1],y[1]);
33});
34
35int prevEnd=-1;
36   for(int[] interval : intervals) {
37    int start=interval[0];
38    int end=interval[1];
39
40    if(start > prevEnd) {
41        ans.add(s.substring(start,end+1));
42        prevEnd=end;
43    }
44}
45    return ans;
46 }
47public static String NON (int n,int f,int r,String s,int[] first,int[] last){
48        
49        int start=f,end=r;
50
51        for(int i=f;i<=r;i++){
52                char c=s.charAt(i);
53                int index=c-'a';
54                if(first[index]<f) return null;
55                if(last[index]>r){
56                    r=last[index];
57                   end=r;  //expanding 
58                }
59
60        }
61        return s.substring(start,end+1);
62    }
63}