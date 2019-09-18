package me.yuqiao;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /**
     * @param head
     * @return
     */
    public boolean hasCycleBySet(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<ListNode>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }


    /**
     * @param head
     * @return
     */
    public boolean hasCycleByPointer(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
