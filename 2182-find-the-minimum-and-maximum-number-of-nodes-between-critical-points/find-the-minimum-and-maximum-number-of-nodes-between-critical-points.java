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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr=head.next;
        ListNode prev=head;
        int arr[]=new int[2];
        int min=Integer.MAX_VALUE;
        int max=0,b=0,j=1;
        int z=0,k=-1,l=-1,x=-1;
        List<Integer> ans=new ArrayList<>();
        while(curr!=null && curr.next!=null){
            int val=curr.val;
            int val1=curr.next.val;
            int val2=prev.val;
            if(val<val1 && val<val2){
                b=1;
                ans.add(j);
            }
            else if(val>val1 && val>val2){
                b=1;
                ans.add(j);
            }
            curr=curr.next;
            prev=prev.next;
            j++;

        }
        if(b==0 || ans.size()==1){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        else{
            int n=ans.size();
            for(int i:ans){
                if(z==0){
                    k=i;
                    l=i;

                }
                else if(z==n-1){
                        x=i;
                        min=Math.min(min,i-k);
                }
                else{
                    min=Math.min(min,i-k);
                    k=i;


                }
                z++;
            
            }
            max=x-l;
            arr[0]=min;
            arr[1]=max;
            return arr;


        }
        
    }
}