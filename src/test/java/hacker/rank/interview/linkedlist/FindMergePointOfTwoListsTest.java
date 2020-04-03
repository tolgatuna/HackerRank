package hacker.rank.interview.linkedlist;

import org.hamcrest.Matchers;
import org.junit.Test;

import static hacker.rank.interview.linkedlist.FindMergePointOfTwoLists.SinglyLinkedListNode;
import static org.junit.Assert.assertThat;

public class FindMergePointOfTwoListsTest {

    @Test
    public void shouldTestMergeMethod() {
        SinglyLinkedListNode list1 = new SinglyLinkedListNode(11);
        list1.next = new SinglyLinkedListNode(2);
        list1.next.next = new SinglyLinkedListNode(3);

        SinglyLinkedListNode list2 = new SinglyLinkedListNode(1);
        list2.next = new SinglyLinkedListNode(2);
        list2.next.next = new SinglyLinkedListNode(3);

        assertThat(FindMergePointOfTwoLists.findMergeNode(list1, list2), Matchers.is(2));
    }

    @Test
    public void shouldTestMergeMethodForOtherCase() {
        SinglyLinkedListNode list1 = new SinglyLinkedListNode(11);
        list1.next = new SinglyLinkedListNode(2);
        list1.next.next = new SinglyLinkedListNode(3);

        SinglyLinkedListNode list2 = new SinglyLinkedListNode(1);
        list2.next = new SinglyLinkedListNode(3);

        assertThat(FindMergePointOfTwoLists.findMergeNode(list1, list2), Matchers.is(3));
    }

    @Test
    public void shouldTestMergeMethodHarder() {
        SinglyLinkedListNode list1 = new SinglyLinkedListNode(1);
        list1.next = new SinglyLinkedListNode(2);
        list1.next.next = new SinglyLinkedListNode(3);
        list1.next.next.next = new SinglyLinkedListNode(4);
        list1.next.next.next.next = new SinglyLinkedListNode(5);

        SinglyLinkedListNode list2 = new SinglyLinkedListNode(6);
        list2.next = new SinglyLinkedListNode(7);
        list2.next.next = new SinglyLinkedListNode(4);
        list2.next.next.next = new SinglyLinkedListNode(5);

        assertThat(FindMergePointOfTwoLists.findMergeNode(list1, list2), Matchers.is(4));
    }
}