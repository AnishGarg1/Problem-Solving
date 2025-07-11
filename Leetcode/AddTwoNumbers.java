/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;

        ListNode head = new ListNode();
        ListNode t = head;
        int c = 0;

        while (t1 != null || t2 != null) {
            int first = 0;
            if (t1 != null) {
                first = t1.val;
                t1 = t1.next;
            }

            int second = 0;
            if (t2 != null) {
                second = t2.val;
                t2 = t2.next;
            }
            int sum = first + second + c;

            ListNode newNode = new ListNode(sum % 10);
            c = sum / 10;
            t.next = newNode;
            t = newNode;
        }
        if (c != 0) {
            ListNode newNode = new ListNode(c);
            t.next = newNode;
        }
        return head.next;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {

    }
}
