package com.inzy.ds.binarytree;

public class Main {

    public static void main(String[] args) {
        BT bt = new BT();
        bt.add(9);
        bt.add(5);
        bt.add(10);
        bt.add(12);
        bt.add(8);
        bt.add(7);
        bt.add(4);

//        bt.traverseInOrder();
        System.out.println("Max Sum: " + bt.maxSum());

    }
}
