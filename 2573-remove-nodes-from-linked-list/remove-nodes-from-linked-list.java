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
    public ListNode removeNodes(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        ListNode curr1=prev;
        int mx=curr1.val;
        while(curr1!=null && curr1.next!=null){
            if(curr1.next.val<mx){
                curr1.next=curr1.next.next;


            }
            else{
                curr1=curr1.next;
                mx=curr1.val;
            }
        }
        ListNode curr2=prev;
        ListNode prev1=null;
        ListNode next1;
        while(curr2!=null){
            next1=curr2.next;
            curr2.next=prev1;
            prev1=curr2;
            curr2=next1;
        }
        return prev1;
    }
}