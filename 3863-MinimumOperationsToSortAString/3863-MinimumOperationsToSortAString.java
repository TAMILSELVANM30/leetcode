// Last updated: 10/21/2026, 5:57:41 PM
class Solution {
    public int minOperations(String s) {
        int n=s.length();
        char[] c=s.toCharArray();
        boolean sorted=true;
        for(int i=1;i<n;i++){
            if(c[i]<c[i-1]){
                sorted=false;break;
            }
        }
        if(sorted) return 0;
        if(n==2) return -1;
        char max='a', min='z';
        for(char val: c){
            if(val>max) max=val;
            if(val<min) min =val;
        }
        if(min==c[0] || max==c[n-1] ) return 1;
       int max_count=0, min_count=0;
        for(char count:c){
            if(max==count) max_count++;
            if(min==count) min_count++;
        }
        if(max==c[0] && max_count==1 && min==c[n-1] &&  min_count==1 ) return 3;
        return 2;
    }
}