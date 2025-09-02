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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int j=len-n;
        if(len==n){
            return head.next;
        }
        int i=1;
        ListNode curr1=head;
        while(i<j){
            curr1=curr1.next;
            i++;
        }
        if(curr1.next!=null){
            curr1.next=curr1.next.next;
        }
        return head;
    }
}