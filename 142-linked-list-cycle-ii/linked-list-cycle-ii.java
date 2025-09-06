/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        List<ListNode> ans=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            if(ans.contains(curr)){
                return curr;
            }
            ans.add(curr);
            curr=curr.next;
        }
        return null;
        
    }
}