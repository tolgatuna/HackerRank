package hacker.rank.interview.linkedlist;

import org.junit.Test;

import static hacker.rank.interview.linkedlist.ReverseDoublyLinkedList.DoublyLinkedListNode;
import static hacker.rank.interview.linkedlist.ReverseDoublyLinkedList.reverse;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ReverseDoublyLinkedListTest {
    @Test
    public void shouldTestInsertMethod() {
        DoublyLinkedListNode head = new DoublyLinkedListNode(1);
        head.prev = null;
        head.next = new DoublyLinkedListNode(2);
        head.next.prev = head;
        head.next.next = new DoublyLinkedListNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyLinkedListNode(4);
        head.next.next.next.prev = head.next.next;
        DoublyLinkedListNode reversed = reverse(head);

        assertThat(reversed.data, is(4));
        assertThat(reversed.next.data, is(3));
        assertThat(reversed.next.next.data, is(2));
        assertThat(reversed.next.next.next.data, is(1));
    }
}