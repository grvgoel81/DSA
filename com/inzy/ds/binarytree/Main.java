package com.inzy.ds.binarytree;

public class Main {

    public static void main(String[] args) {
        BT bt = new BT();
        bt.add(1);
        bt.add(2);
        bt.add(3);
//        bt.add(12);
//        bt.add(14);
//        bt.add(15);
//        bt.add(17);
//        bt.add(8);
//        bt.add(7);
//        bt.add(6);
//        bt.add(4);

//        bt.traverseInOrder();
        System.out.println("Max Sum: " + bt.maxSum());
        System.out.println("Max Height: " + bt.height());

    }
}
