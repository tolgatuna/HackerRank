package hacker.rank.interview.linkedlist;

public class FindMergePointOfTwoLists {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode current1 = head1;
        SinglyLinkedListNode current2 = head2.next;
        while (current1 != null) {
            while (current2 != null) {
                if (compare(current1, current2)) {
                    return current2.data;
                }
                current2 = current2.next;
            }
            current2 = head2.next;
            current1 = current1.next;
        }
        return 0;
    }

    private static boolean compare(SinglyLinkedListNode current1, SinglyLinkedListNode current2) {
        SinglyLinkedListNode node1 = current1;
        SinglyLinkedListNode node2 = current2;
        boolean isEqual = true;

        while (node1 != null && node2 != null) {
            if (node1.data != node2.data) {
                isEqual = false;
                break;
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        return isEqual && node1 == null && node2 == null;
    }
}
