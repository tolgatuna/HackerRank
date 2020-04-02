package hacker.rank.interview.linkedlist;

import org.hamcrest.Matchers;
import org.junit.Test;

import static hacker.rank.interview.linkedlist.InsertANodeAtSpecificPosition.SinglyLinkedListNode;
import static hacker.rank.interview.linkedlist.InsertANodeAtSpecificPosition.insertNodeAtPosition;
import static org.junit.Assert.assertThat;

public class InsertANodeAtSpecificPositionTest {
    @Test
    public void shouldTestInsertANode() {
        SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(16);
        singlyLinkedListNode.next = new SinglyLinkedListNode(13);
        singlyLinkedListNode.next.next = new SinglyLinkedListNode(7);
        SinglyLinkedListNode calculated = insertNodeAtPosition(singlyLinkedListNode, 1, 2);
        assertThat(calculated.data, Matchers.is(16));
        assertThat(calculated.next.data, Matchers.is(13));
        assertThat(calculated.next.next.data, Matchers.is(1));
        assertThat(calculated.next.next.next.data, Matchers.is(7));

    }
}