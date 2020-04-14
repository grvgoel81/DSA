package com.inzy.ds.linkedlist;

public class Main {

    private static String TAG = "Inzy: ";

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList1 = new LinkedList();

        linkedList.insertNodeAtFront(931);
        linkedList.insertNodeAtFront(830);
        linkedList.insertNodeAtLast(987);
        linkedList.insertNodeAtFront(310);
        linkedList.insertNodeAtFront(105);
        linkedList.insertNodeAtLast(1001);
        linkedList.insertNodeAtFront(21);
        linkedList1.insertNodeAtFront(987);
        linkedList1.insertNodeAtFront(510);
        linkedList1.insertNodeAtFront(310);
        linkedList1.insertNodeAtFront(24);
        linkedList1.insertNodeAtFront(54);
        linkedList1.insertNodeAtFront(43);
        linkedList1.insertNodeAtFront(21);
        linkedList1.insertNodeAtFront(11);

        UtilityMethod.addIntersection(linkedList1.getHead(), linkedList.getHead());
//        linkedList.insertNodeAtPos(3, 2);
//        linkedList.deleteNodeByKey(1);
//        linkedList.print();
//        System.out.println(TAG + "Count: " + linkedList.getCount());
//        System.out.println(TAG + "Search: " + linkedList.search(0));
//        System.out.println(TAG + "GetNth: " + linkedList.getNth(0));
//        System.out.println(TAG + "GetNthFromLast: " + linkedList.printNthFromLast(3));
//        System.out.println(TAG + "Loop: " + linkedList.detectLoop());
//        linkedList.reverse();
//        linkedList.removeDuplicateFromSorted();
//        linkedList.removeDuplicateFromUnsorted();
        linkedList1.print();
        linkedList1.segregateEvenOdd();
        linkedList1.print();
//        linkedList.swapNodes(4,7);
//        linkedList.pairWiseSwap();
//        linkedList.moveFrontElementToLast();
//        linkedList.print();
//        System.out.println(TAG + UtilityMethod.intersectionPoint(linkedList1, linkedList));

    }
}
