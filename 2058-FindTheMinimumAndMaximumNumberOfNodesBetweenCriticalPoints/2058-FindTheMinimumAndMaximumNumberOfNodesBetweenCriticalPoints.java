// Last updated: 9/14/2026, 11:55:18 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int prev=head.val;
        ListNode curr=head.next;
        int idx=1;
        int firstidx=-1;
        int lastidx=-1;
        int mindistance=Integer.MAX_VALUE;
        while(curr.next!=null){
            int currval=curr.val;
          //  int next=curr.next.val;
           if(critical(prev, currval, curr)){
            if(firstidx==-1){
                firstidx=idx;
                lastidx=idx;
            }
            else{
                mindistance=Math.min(mindistance, idx-lastidx);
                lastidx=idx;
            }

           }
           
            prev=currval;
            curr=curr.next;
            idx+=1;
        }
        if(firstidx==-1 || firstidx==lastidx){
            return new int[]{-1,-1};
        }
        int maxdistance=lastidx-firstidx;
        return new int[]{mindistance,maxdistance};
        
    }
    public boolean critical(int prev, int currval, ListNode curr ){
        return prev>currval && currval<curr.next.val || prev<currval && currval>curr.next.val; 

    }
}