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
    public ListNode deleteMiddle(ListNode head) {

        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
        /*if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;

        
    }
    /*ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        if(head==null || head.next==null){
            return null;
        }

        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
        if(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;*/
}