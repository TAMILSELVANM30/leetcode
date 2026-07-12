// Last updated: 7/12/2026, 8:42:30 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        return fun(startTime, endTime);
4    }
5    public int fun(String startTime, String endTime){
6        String [] st=startTime.split(":");
7        String [] et = endTime.split(":");
8        int shr=Integer.parseInt(st[0]);
9        int sm=Integer.parseInt(st[1]);
10        int ss=Integer.parseInt(st[2]);
11        int ehr=Integer.parseInt(et[0]);
12        int em=Integer.parseInt(et[1]);
13        int es=Integer.parseInt(et[2]);
14        int Start=(shr*3600+sm*60+ss);
15        int End=(ehr*3600+em*60+es);
16        return Math.abs(Start-End);
17    }
18}