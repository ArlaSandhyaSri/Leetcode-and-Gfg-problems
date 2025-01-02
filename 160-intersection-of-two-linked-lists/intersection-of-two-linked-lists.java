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
        ListNode temp1=headA;
        ListNode temp2=headB;

        int count1=1;
        int count2=1;
        while(temp1.next!=null || temp2.next!=null){
            if(temp1.next!=null){
                count1++;
                temp1=temp1.next;
            }
            if(temp2.next!=null){
                count2++;
                temp2=temp2.next;
            }
        }
        if(temp1!=temp2){
            return null;
        }
        temp1=headA;
        temp2=headB;
        for(int i=1;i<=count1-count2;i++){
            temp1=temp1.next;

        }
        for(int i=1;i<=count2-count1;i++){
            temp2=temp2.next;
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
        /*ListNode temp1=headA;
        ListNode temp2=headB;

        int count1=1;
        int count2=1;

        while(temp1.next!=null || temp2.next!=null){
            if(temp1.next!=null){
                count1++;
                temp1=temp1.next;
            }
            if(temp2.next!=null){
                count2++;
                temp2=temp2.next;
            }

        }
        if(temp1!=temp2){
            return null;
        }

        temp1=headA;
        temp2=headB;
        for(int i=1;i<=count1-count2;i++){
            temp1=temp1.next;
        }
        for(int i=1;i<=count2-count1;i++){
            temp2=temp2.next;
        }

        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
        
    }*/
    /*
    Approach
Traverse throught the two list and find the last elements, if the last node of both lists are not same return NULL
Find the length of two lists, if a list is longer than the other move the nodes of the longer list till both the lengths are same
Now move the head of the lists until the nodes from list1 and list2 are equal, return either of the list*/
