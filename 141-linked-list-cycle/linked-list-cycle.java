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
    public boolean hasCycle(ListNode head) {
        List<ListNode> ans=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            if(ans.contains(curr)){
                return true;
            }
            ans.add(curr);
            curr=curr.next;
        }
        return false;
        
    }
}