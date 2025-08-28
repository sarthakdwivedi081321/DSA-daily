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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode curr1=dummy;
        ListNode curr=head.next;
        int sum=0;
        while(curr!=null){
            if(curr.val==0){
                curr1.next=new ListNode(sum);
                curr1=curr1.next;

                sum=0;
            }
            else{
                sum+=curr.val;

            }
            curr=curr.next;
        }
        return dummy.next;
        
    }
}