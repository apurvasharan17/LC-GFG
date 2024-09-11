public class InsertGCDinLL {
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null){
            int num1=slow.val;
            int num2=fast.val;
            int data=gcd(num1,num2);
            ListNode newNode=new ListNode(data);
            newNode.next=slow.next;
            slow.next=newNode;
            slow=slow.next.next;
            fast=fast.next;
        }
        return head;
    }
    //to calculate gcd
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
}
