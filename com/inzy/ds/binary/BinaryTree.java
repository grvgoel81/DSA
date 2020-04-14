package com.inzy.ds.binary;


class BinaryTree {
    private BinaryNode rootNode;
    private int maxNo;
    private BinaryNode targetLeaf = null;

    private boolean printBinaryPath(BinaryNode node, BinaryNode targetLeaf) {

        if (node == null)
            return false;

        if (node == targetLeaf || printBinaryPath(node.left, targetLeaf) || printBinaryPath(node.right, targetLeaf)) {
            System.out.print(node.data + " ");
            return true;
        }

        return false;
    }

    private void getTargetLeaf(BinaryNode node, int curr_sum) {
        if (node == null)
            return;

        curr_sum = curr_sum + node.data;

        if (node.left == null && node.right == null) {
            if (curr_sum > maxNo) {
                maxNo = curr_sum;
                targetLeaf = node;
            }
        }

        getTargetLeaf(node.left, curr_sum);
        getTargetLeaf(node.right, curr_sum);
    }

    private int maxSum() {
        if (rootNode == null)
            return 0;
        getTargetLeaf(rootNode, 0);
        printBinaryPath(rootNode, targetLeaf);
        return maxNo;
    }

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.rootNode = new BinaryNode(5);
        bTree.rootNode.left = new BinaryNode(3);
        bTree.rootNode.right = new BinaryNode(7);

        bTree.rootNode.left.left = new BinaryNode(4);
        bTree.rootNode.left.right = new BinaryNode(2);

        bTree.rootNode.right.left = new BinaryNode(1);
        bTree.rootNode.right.right = new BinaryNode(8);

        bTree.rootNode.left.left.left = new BinaryNode(9);
        bTree.rootNode.left.left.right = new BinaryNode(11);

        bTree.rootNode.right.left.left = new BinaryNode(4);
        bTree.rootNode.right.left.right = new BinaryNode(2);

        bTree.rootNode.right.right.left = new BinaryNode(5);
        bTree.rootNode.right.right.right = new BinaryNode(6);

        int sum = bTree.maxSum();
        System.out.println("Sum of all nodes is : " + sum);
    }
}
