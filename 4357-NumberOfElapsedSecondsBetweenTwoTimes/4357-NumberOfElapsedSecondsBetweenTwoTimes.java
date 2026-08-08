// Last updated: 8/8/2026, 9:50:03 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return fun(startTime, endTime);
    }
    public int fun(String startTime, String endTime){
        String [] st=startTime.split(":");
        String [] et = endTime.split(":");
        int shr=Integer.parseInt(st[0]);
        int sm=Integer.parseInt(st[1]);
        int ss=Integer.parseInt(st[2]);
        int ehr=Integer.parseInt(et[0]);
        int em=Integer.parseInt(et[1]);
        int es=Integer.parseInt(et[2]);
        int Start=(shr*3600+sm*60+ss);
        int End=(ehr*3600+em*60+es);
        System.gc();
        return Math.abs(Start-End);
    }
}