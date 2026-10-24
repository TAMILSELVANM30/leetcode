// Last updated: 10/24/2026, 10:39:45 PM
1class Solution {
2    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
3        int [] day ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
4        int a=days(day,arriveAlice);
5        int b=days(day,leaveAlice);
6        int c=days(day,arriveBob);
7        int d=days(day,leaveBob);
8        int maxi=Math.max(a,c);
9        int mini=Math.min(b,d);
10         return Math.max(0, mini-maxi+1); //mini>maxi
11
12        
13    }
14    public static int  days(int[] day, String maja  ){
15        int daysss=0;
16        int month=Integer.parseInt(maja.substring(0,2));
17        int date=Integer.parseInt(maja.substring(3,5));
18        for(int i=0;i<month-1;i++){
19            daysss+=day[i];
20        }
21        daysss+=date;
22        return daysss;
23    } 
24}