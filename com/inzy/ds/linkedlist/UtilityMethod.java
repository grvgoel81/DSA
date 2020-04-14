package com.inzy.ds.linkedlist;

public class UtilityMethod {
    static void intersection(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                System.out.print("[ " + temp1.data + "] ");
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else if (temp1.data < temp2.data)
                temp1 = temp1.next;
            else
                temp2 = temp2.next;
        }
    }

    static int intersectionPoint(LinkedList l1, LinkedList l2) {
        int count1 = l1.getCount(l1.getHead());
        int count2 = l2.getCount(l2.getHead());

        if (count1 > count2) {
            int d = count1 - count2;
            return getIntersection(d, l1.getHead(), l2.getHead());
        } else {
            int d = count2 - count1;
            return getIntersection(d, l2.getHead(), l1.getHead());
        }
    }

    static int getIntersection(int d, Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        for (int i = 0; i < d; i++) {
            temp1 = temp1.next;
        }

        while (temp1 != null) {
            if (temp1 == temp2)
                return temp1.data;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return -1;
    }

    static void addIntersection(Node head1, Node head2) {
        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head2.next.next.next.next.next.next;
    }
}
