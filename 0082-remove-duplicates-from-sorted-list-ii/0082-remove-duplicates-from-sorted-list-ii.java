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
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        ListNode curr=head;
        while(curr!=null){
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode curr1=dummy;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                curr1.next=new ListNode(i);
                curr1=curr1.next;
            }
        }
        return dummy.next;
    }
}