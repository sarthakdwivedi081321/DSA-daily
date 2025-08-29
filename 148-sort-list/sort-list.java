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
    public ListNode sortList(ListNode head) {
        ListNode curr=head;
        List<Integer> ans=new ArrayList<>();
        while(curr!=null){
            int val=curr.val;
            ans.add(val);
            curr=curr.next;
        }
        Collections.sort(ans);
        ListNode curr1=head;
        int j=0;
        while(curr1!=null){
            curr1.val=ans.get(j);
            curr1=curr1.next;
            j++;
        }
        return head;
        

        
    }
}