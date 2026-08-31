// Last updated: 8/31/2026, 10:41:07 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        int prev=head.val;
14        ListNode curr=head.next;
15        int idx=1;
16        int firstidx=-1;
17        int lastidx=-1;
18        int mindistance=Integer.MAX_VALUE;
19        while(curr.next!=null){
20            int currval=curr.val;
21          //  int next=curr.next.val;
22           if(critical(prev, currval, curr)){
23            if(firstidx==-1){
24                firstidx=idx;
25                lastidx=idx;
26            }
27            else{
28                mindistance=Math.min(mindistance, idx-lastidx);
29                lastidx=idx;
30            }
31
32           }
33           
34            prev=currval;
35            curr=curr.next;
36            idx+=1;
37        }
38        if(firstidx==-1 || firstidx==lastidx){
39            return new int[]{-1,-1};
40        }
41        int maxdistance=lastidx-firstidx;
42        return new int[]{mindistance,maxdistance};
43        
44    }
45    public boolean critical(int prev, int currval, ListNode curr ){
46        return prev>currval && currval<curr.next.val || prev<currval && currval>curr.next.val; 
47
48    }
49}