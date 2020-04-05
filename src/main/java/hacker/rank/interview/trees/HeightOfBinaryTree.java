package hacker.rank.interview.trees;

public class HeightOfBinaryTree {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static int height(Node root) {
        int maxCount = 0;
        if (root.right != null || root.left != null) {
            for (int i = 0; i <= 20; i++) {
                int count = findLocationForValue(root, i);
                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }
        return maxCount;
    }

    private static int findLocationForValue(Node root, int i) {
        int count = 0;
        Node current = root;
        while (true) {
            if (current == null) {
                return 0;
            } else {
                if (i > current.data) {
                    current = current.right;
                    count++;
                } else if (i < current.data) {
                    current = current.left;
                    count++;
                } else {
                    return count;
                }
            }
        }
    }
}
