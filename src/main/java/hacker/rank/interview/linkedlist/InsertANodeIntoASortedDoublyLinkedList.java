package hacker.rank.interview.linkedlist;

public class InsertANodeIntoASortedDoublyLinkedList {

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

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        if (head == null) {
            head = newNode;
        } else if (head.data >= data) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            DoublyLinkedListNode currentPoint = head;
            while (currentPoint.next != null) {
                currentPoint = currentPoint.next;
                if (currentPoint.data >= data) {
                    currentPoint = currentPoint.prev;
                    break;
                }
            }
            DoublyLinkedListNode next = currentPoint.next;
            currentPoint.next = newNode;
            newNode.next = next;
            newNode.prev = currentPoint;
        }

        return head;
    }
}
