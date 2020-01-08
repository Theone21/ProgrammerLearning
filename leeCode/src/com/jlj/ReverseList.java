package com.jlj;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if (head.next == null || head == null){
            return head;
        } else {
            ListNode nextNode = reverseList(head.next);
//            ListNode tempNode = nextNode;
//            while (tempNode.next != null){
//                tempNode = tempNode.next;
//            }
//            tempNode.next = head;
            head.next.next = head;
            head.next = null;
            return nextNode;
        }
    }
}
