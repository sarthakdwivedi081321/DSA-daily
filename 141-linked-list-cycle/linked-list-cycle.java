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
        ListNode curr=head;
        HashSet<ListNode> ans=new HashSet<>();
        while(curr!=null){
            if(ans.contains(curr)){
                return true;
            }
            else{
                ans.add(curr);
            }
            curr=curr.next;
        }
        return false;
        
    }
}