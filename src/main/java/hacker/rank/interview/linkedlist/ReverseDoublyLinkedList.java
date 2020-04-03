package hacker.rank.interview.linkedlist;

public class ReverseDoublyLinkedList {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode end = head;

        while (end.next != null) {
            end = end.next;
        }

        DoublyLinkedListNode newHead = new DoublyLinkedListNode(end.data);
        newHead.prev = null;
        DoublyLinkedListNode initializer = newHead;
        while (end.prev != null) {

            initializer.next = new DoublyLinkedListNode(end.prev.data);
            initializer.next.prev = initializer;
            initializer = initializer.next;

            end = end.prev;
        }
        return newHead;
    }
}
