/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {

        }
 *     ListNode(int val) {
            this.val = val;
        }
 *     ListNode(int val, ListNode next) {
            this.val = val; 
            this.next = next; 
        }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node=new ListNode();
        int first=0;
        int second=0;
        int carry=0;
        while(l1!=null || l2!=null){
            if(l1!=null){
                first=l1.val;
                l1=l1.next;
            }
            else{
                first=0;
            }
            if(l2!=null){
                second=l2.val;
                l2=l2.next;
            }
            else{
                second=0;
            }
            int sum = first+second+carry;
            ListNode temp=node;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new ListNode();
            temp=temp.next;
            if(sum>9){
                temp.val=sum%10;
                carry= sum/10;
            }
            else{
                temp.val=sum%10;
                carry=sum/10;
            }     
        }
        if(carry!=0){
            ListNode use=node;
            while(use.next!=null){
                use=use.next;
            }
            use.next=new ListNode(carry);
        }
         
        
        return node.next;
    }
}