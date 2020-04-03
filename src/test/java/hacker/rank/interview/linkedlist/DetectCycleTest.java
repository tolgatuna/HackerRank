package hacker.rank.interview.linkedlist;

import org.hamcrest.Matchers;
import org.junit.Test;

import static hacker.rank.interview.linkedlist.DetectCycle.Node;
import static hacker.rank.interview.linkedlist.DetectCycle.hasCycle;
import static org.junit.Assert.assertThat;

public class DetectCycleTest {

    @Test
    public void testHasCycle() {
        Node node = new Node(1);
        assertThat(hasCycle(node), Matchers.is(false));
    }

    @Test
    public void testHasCycleForCycleCase() {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = node.next;
        assertThat(hasCycle(node), Matchers.is(true));
    }
}