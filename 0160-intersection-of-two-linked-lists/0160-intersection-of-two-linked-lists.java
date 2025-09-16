/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      HashSet<ListNode> ans1=new HashSet<>();
      while(headA!=null){
        ans1.add(headA);
        headA=headA.next;
      }
      while(headB!=null){
        if(ans1.contains(headB)){
            return headB;
        }
        headB=headB.next;
      }
      return null;  
    }
}