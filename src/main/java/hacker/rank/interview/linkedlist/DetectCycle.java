package hacker.rank.interview.linkedlist;

import java.util.Objects;

public class DetectCycle {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return data == node.data &&
                    Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, next);
        }
    }

    static boolean hasCycle(Node head) {
        int currentIndex = 0;
        Node current = head;
        Node test = head;
        while (current != null) {
            for (int i = 0; i < currentIndex; i++) {
                if (test == current) {
                    return true;
                }
                test = test.next;
            }
            test = head;
            currentIndex++;
            current = current.next;
        }
        return false;
    }
}
