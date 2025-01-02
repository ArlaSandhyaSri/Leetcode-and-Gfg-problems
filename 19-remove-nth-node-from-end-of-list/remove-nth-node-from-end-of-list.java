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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }

        if(len<=2){
            if(len==1){
                //head=null;
                return null;
            }
            else if(len==2){
                if(n==1){
                    head.next=null;
                    return head;
                }
                else{
                    head=head.next;
                    return head;
                }
            }
        }

        if(len-n==0){
            head=head.next;
            return head;
        }
        temp=head;
        for(int i=1;i<len-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
      /*  ListNode temp=head;
        int count=0;
        ListNode prev=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count<=2){
            if(count==1){
                head=null;
                return null;
            }if(count==2){
                if(n==1){
                    head.next=null;
                    return head;
                }else{
                    head=head.next;
                    return head;
                }

            }
        }
        if(count-n==0){
            head=head.next;
            return head;
        }
        temp=head;
        for(int i=1;i<count-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;


        
    }
}*/