package com.inzy.ds.binarytree;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(5);
//        bt.add(2);
//        bt.add(3);
        binaryTree.add(12);
        binaryTree.add(14);
        binaryTree.add(15);
        binaryTree.add(17);
        binaryTree.add(8);
        binaryTree.add(7);
        binaryTree.add(6);
        binaryTree.add(4);

//        bt.traverseInOrder();
        System.out.println("Max Sum: " + binaryTree.maxSum());
        System.out.println("Max Height: " + binaryTree.height());

    }
}
