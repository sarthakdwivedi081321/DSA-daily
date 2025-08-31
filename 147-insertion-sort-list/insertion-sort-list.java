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
    public ListNode insertionSortList(ListNode head) {
        ListNode curr=head;
        List<Integer> ans=new ArrayList<>();
        while(curr!=null){
            ans.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(ans);
        ListNode dummy=new ListNode(0);
        ListNode curr1=dummy;
        int j=0;
        while(j<ans.size()){
            curr1.next=new ListNode(ans.get(j));
            j++;
            curr1=curr1.next;
        }
        return dummy.next;
        
    }
}