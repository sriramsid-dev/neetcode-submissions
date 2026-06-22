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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null)
        {
            ListNode temp=list1;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=list2;
            for(ListNode tempi=list1;tempi!=null;tempi=tempi.next)
            {
                for(ListNode temp1=list1;temp1!=null;temp1=temp1.next)
                {
                    if(tempi.val<temp1.val)
                    {
                        int d=tempi.val;
                        tempi.val=temp1.val;
                        temp1.val=d;
                    }
                }
            }
            return list1;
        }
        else if(list1==null && list2==null)
        {
            return list1;
        }
        else if(list1==null && list2!=null)
        {
            return list2;
        }
        return list1;
    }
}