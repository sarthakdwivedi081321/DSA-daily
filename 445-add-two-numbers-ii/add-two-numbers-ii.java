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
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr=l1;
        String str="";
        while(curr!=null){
            String st=String.valueOf(curr.val);
            str+=st;
            curr=curr.next;
        }
        ListNode curr1=l2;
        String str1="";
        while(curr1!=null){
            String st1=String.valueOf(curr1.val);
            str1+=st1;
            curr1=curr1.next;
        }
        BigInteger a = new BigInteger(str);
        BigInteger b = new BigInteger(str1);
        BigInteger c=a.add(b);
        String str4=c.toString();
        ListNode dummy=new ListNode(0);
        int n=str4.length();
        ListNode curr2=dummy;
        int j=0;
        while(j<n){
            curr2.next=new ListNode(str4.charAt(j)-'0');
            curr2=curr2.next;
            j++;
        }
        return dummy.next;

        
    }
}