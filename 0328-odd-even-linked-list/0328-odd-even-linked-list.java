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
    public ListNode oddEvenList(ListNode head) {
        ListNode curr=head;
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        int j=0;
        while(curr!=null){
            if(j%2==0){
                ans1.add(curr.val);
            }
            else{
                ans2.add(curr.val);
            }
            curr=curr.next;
            j++;
        }
        j=0;
        ListNode curr2=head;
        int k=0;
        while(curr2!=null){
            if(j<ans1.size()){
                curr2.val=ans1.get(j);
                j++;
            }
            else{
                curr2.val=ans2.get(k);
                k++;
            }
            curr2=curr2.next;
        }
        return head;


        
    }
}