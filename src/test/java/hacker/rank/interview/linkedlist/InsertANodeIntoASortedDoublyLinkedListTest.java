package hacker.rank.interview.linkedlist;

import org.junit.Test;

import static hacker.rank.interview.linkedlist.InsertANodeIntoASortedDoublyLinkedList.DoublyLinkedListNode;
import static hacker.rank.interview.linkedlist.InsertANodeIntoASortedDoublyLinkedList.sortedInsert;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class InsertANodeIntoASortedDoublyLinkedListTest {
    @Test
    public void shouldTestInsertMethod() {
        DoublyLinkedListNode head = new DoublyLinkedListNode(1);
        head.next = new DoublyLinkedListNode(3);
        head.next.prev = head;
        head.next.next = new DoublyLinkedListNode(4);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyLinkedListNode(10);
        head.next.next.next.prev = head.next.next;
        DoublyLinkedListNode calculated = sortedInsert(head, 5);
        assertThat(calculated.data, is(1));
        assertThat(calculated.next.data, is(3));
        assertThat(calculated.next.next.data, is(4));
        assertThat(calculated.next.next.next.data, is(5));
        assertThat(calculated.next.next.next.next.data, is(10));
    }

    @Test
    public void shouldTestInsertMethodForOtherCase() {
        DoublyLinkedListNode head = new DoublyLinkedListNode(1);
        head.next = new DoublyLinkedListNode(2);
        head.next.prev = head;
        head.next.next = new DoublyLinkedListNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyLinkedListNode(4);
        head.next.next.next.prev = head.next.next;
        DoublyLinkedListNode calculated = sortedInsert(head, 5);
        assertThat(calculated.data, is(1));
        assertThat(calculated.next.data, is(2));
        assertThat(calculated.next.next.data, is(3));
        assertThat(calculated.next.next.next.data, is(4));
        assertThat(calculated.next.next.next.next.data, is(5));
    }

    @Test
    public void shouldTestInsertMethodForTheOtherCase() {
        DoublyLinkedListNode head = new DoublyLinkedListNode(2);
        head.next = new DoublyLinkedListNode(3);
        head.next.prev = head;
        head.next.next = new DoublyLinkedListNode(4);
        head.next.next.prev = head.next;
        DoublyLinkedListNode calculated = sortedInsert(head, 1);
        assertThat(calculated.data, is(1));
        assertThat(calculated.next.data, is(2));
        assertThat(calculated.next.next.data, is(3));
        assertThat(calculated.next.next.next.data, is(4));
    }
}