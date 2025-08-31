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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        LinkedHashSet<Integer> ans=new LinkedHashSet<>();
        while(curr!=null){
            ans.add(curr.val);
            curr=curr.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode curr1=dummy;
        for(int i:ans){
            curr1.next=new ListNode(i);
            curr1=curr1.next;
        }
        return dummy.next;

        
    }
}