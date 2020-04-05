package hacker.rank.interview.trees;

import org.junit.Test;

import static hacker.rank.interview.trees.LowestCommonAncestor.Node;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LowestCommonAncestorTest {
    @Test
    public void testLCA() {
        Node head = new Node(2);
        head.left = new Node(1);
        head.right = new Node(3);
        head.right.left = new Node(4);
        head.right.right = new Node(5);
        head.right.right.left = new Node(6);

        assertThat(LowestCommonAncestor.lca(head, 4, 6).data, is(3));
    }
}