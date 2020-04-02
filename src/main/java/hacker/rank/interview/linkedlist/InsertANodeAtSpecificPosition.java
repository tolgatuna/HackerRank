package hacker.rank.interview.linkedlist;

public class InsertANodeAtSpecificPosition {
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        int iterator = 0;
        SinglyLinkedListNode afterPosition = head;
        SinglyLinkedListNode current = head;
        while (iterator < position) {
            current = afterPosition;
            afterPosition = afterPosition.next;
            iterator++;
        }
        current.next = new SinglyLinkedListNode(data);
        current.next.next = afterPosition;
        return head;
    }

    protected static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
}
