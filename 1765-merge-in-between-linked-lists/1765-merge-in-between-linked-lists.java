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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1=list1;
        ListNode curr2=list2;
        for(int i=0;i<a-1;i++){
            curr1=curr1.next;
        }
        ListNode curr3=curr1;
        for(int i=0;i<=(b-a)+1;i++){
            curr3=curr3.next;
        }
        while(curr2.next!=null){
            curr2=curr2.next;
        }
        curr2.next=curr3;
        curr1.next=list2;
        return list1;
        
    }
}