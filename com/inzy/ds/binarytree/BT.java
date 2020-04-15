package com.inzy.ds.binarytree;

public class BT {
    BTNode root;

    void add(int val) {
        root = addRecursive(val, root);
    }

    private BTNode addRecursive(int data, BTNode node) {
        if (node == null)
            return new BTNode(data);

        if (data < node.data)
            node.left = addRecursive(data, node.left);
        else node.right = addRecursive(data, node.right);
        return node;
    }

    BTNode deleteRecursive(BTNode current, int value) {
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

    private void traverseInOrder(BTNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(node.data);
            traverseInOrder(node.right);
        }
    }

    int maxSum = Integer.MIN_VALUE;

    void getMaxSumRec(BTNode node, int currSum) {
        if (node == null) return;
        currSum = currSum + node.data;
        if (node.left == null && node.right == null) {
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        getMaxSumRec(node.left, currSum);
        getMaxSumRec(node.right, currSum);
    }


    private void getHeight(BTNode node, int currHeight) {
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

    private int btHeight = Integer.MIN_VALUE;

    int height() {
        if (root == null) {
            return 0;
        }
        getHeight(root, 0);
        return btHeight;
    }

    int maxSum() {
        if (root == null)
            return 0;
        getMaxSumRec(root, 0);
        return maxSum;
    }
}
