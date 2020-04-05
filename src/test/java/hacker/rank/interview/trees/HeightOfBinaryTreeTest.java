package hacker.rank.interview.trees;

import org.junit.Test;

import static hacker.rank.interview.trees.HeightOfBinaryTree.Node;
import static hacker.rank.interview.trees.HeightOfBinaryTree.height;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HeightOfBinaryTreeTest {
    @Test
    public void testHeight() {
        Node node = new Node(15);
        assertThat(height(node), is(0));
    }

    @Test
    public void testHeightForCase2() {
        Node node = new Node(3);
        node.right = new Node(5);
        node.left = new Node(2);
        node.left.left = new Node(1);
        node.right.left = new Node(4);
        node.right.right = new Node(6);
        node.right.right.right = new Node(7);

        assertThat(height(node), is(3));
    }
}