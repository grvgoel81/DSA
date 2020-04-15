package com.inzy.ds.binarytree;


public class BinaryTree {
    private Node root;
    private Node targetLeaf;
    private int btHeight = Integer.MIN_VALUE;
    private int maxSum = Integer.MIN_VALUE;

    void add(int val) {
        root = addRecursive(val, root);
    }

    private Node addRecursive(int data, Node node) {
        if (node == null)
            return new Node(data);

        if (data < node.data)
            node.left = addRecursive(data, node.left);
        else node.right = addRecursive(data, node.right);
        return node;
    }

    void delete(int val) {
        if (root == null)
            return;
        deleteRecursive(root, val);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null)
            return current;
        if (value == current.data) {

        }
        if (value < current.data) {
            current.left = deleteRecursive(current.left, value);
            return current;
        } else {
            current.right = deleteRecursive(current.right, value);
            return current;
        }
    }

    void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(node.data);
            traverseInOrder(node.right);
        }
    }

    private boolean printBinaryPath(Node node, Node targetLeaf) {

        if (node == null)
            return false;

        if (node == targetLeaf || printBinaryPath(node.left, targetLeaf) || printBinaryPath(node.right, targetLeaf)) {
            System.out.print(node.data + " ");
            return true;
        }

        return false;
    }


    private void getMaxSumRec(Node node, int currSum) {
        if (node == null) return;
        currSum = currSum + node.data;
        if (node.left == null && node.right == null) {
            if (currSum > maxSum) {
                maxSum = currSum;
                targetLeaf = node;
            }
        }
        getMaxSumRec(node.left, currSum);
        getMaxSumRec(node.right, currSum);
    }

    int maxSum() {
        if (root == null)
            return 0;
        getMaxSumRec(root, 0);
        printBinaryPath(root, targetLeaf);
        return maxSum;
    }

    private void getHeight(Node node, int currHeight) {
        if (node == null) {
            return;
        }

        currHeight = currHeight + 1;
        if (node.left == null && node.right == null) {
            if (currHeight > btHeight) {
                btHeight = currHeight;
            }
        }
        getHeight(node.left, currHeight);
        getHeight(node.right, currHeight);
    }


    int height() {
        if (root == null) {
            return 0;
        }
        getHeight(root, 0);
        return btHeight;
    }
}
