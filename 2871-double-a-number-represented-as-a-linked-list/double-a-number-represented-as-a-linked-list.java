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
    public ListNode doubleIt(ListNode head) {
        String str="";
        ListNode curr=head;
        while(curr!=null){
            String str1=String.valueOf(curr.val);
            str+=str1;
            curr=curr.next;

        }
        BigInteger bigInt = new BigInteger(str);
        BigInteger result = bigInt.multiply(BigInteger.valueOf(2));
        String st = result.toString();

        ListNode dummy=new ListNode(0);
        ListNode curr1=dummy;
        int n=st.length();
        int j=0;
        while(j<n){
            curr1.next=new ListNode(st.charAt(j)-'0');
            curr1=curr1.next;
            j++;
        }
        return dummy.next;

        
    }
}