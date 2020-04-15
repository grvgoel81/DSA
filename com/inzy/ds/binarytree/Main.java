package com.inzy.ds.binarytree;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(11);
        binaryTree.add(12);
        binaryTree.add(14);
        binaryTree.add(15);
        binaryTree.add(3);
        binaryTree.add(8);
        binaryTree.add(7);
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.delete(14);
        binaryTree.traverseInOrder();
        System.out.println("Max Sum: " + binaryTree.maxSum());
        System.out.println("Max Height: " + binaryTree.height());
        binaryTree.printNodesKDistanceFromRoot(7);
        int[] pre = {10, 30, 20, 5, 15};
        char[] preLN = {'N', 'N', 'L', 'L', 'P'};
        binaryTree.constructTree(5, pre, preLN);
        binaryTree.traversePreOrder();
    }
}
