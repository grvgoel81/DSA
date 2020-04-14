package com.inzy.ds.example;

public class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private static String TAG = "LINKEDLIST: ";
    private Node head = null;

    private Node reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] strg) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList();
//        linkedList.insertAtStart(0);
//        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(2);
//        linkedList.insertAtEnd(5);
//        linkedList.insertAtPosition(10, 3);
//        linkedList.size();
//        linkedList.traverse();
//        linkedList.deleteKeyAtPos(4);
//        linkedList.traverse();
//        linkedList.size();
//        System.out.println(TAG + linkedList.search(7));
//        System.out.println(TAG + linkedList.searchRecursive(linkedList.head, 6));
//        System.out.println(TAG + linkedList.getNthItem(4));
//        System.out.println(TAG + linkedList.getNthItem(7));
//        System.out.println(TAG + linkedList.count(5));
//        System.out.println(TAG + linkedList.checkPalindrome(linkedList));
//        linkedList.removeDupSorted();
        linkedList.traverse();
        linkedList.reverse();
        System.out.println("After Reversal");
        linkedList.traverse();
    }

    private void removeDupSorted() {
        Node temp = head;
        if (temp == null) {
            return;
        }
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp = temp.next.next;
            }
            if (temp != null)
                temp = temp.next;
        }
    }

    private boolean checkPalindrome(LinkedList linkedList) {

        for (int i = 1; i <= linkedList.size() / 2; i++) {
            if (linkedList.getNthItem(i) != linkedList.getNthItem((linkedList.size() - i) + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean detectLoop() {
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return true;
            }
        }
        return false;
    }

    private int count(int search_for) {
        Node temp = head;
        if (temp == null) {
            return 0;
        }
        int count = 0;
        while (temp != null) {
            if (search_for == temp.data)
                count++;
            temp = temp.next;

        }
        return count;
    }

    private int getNthItem(int n) {
        Node temp = head;
        if (temp == null) {
            return -1;
        }
        int count = 1;
        while (temp != null) {
            if (count == n)
                return temp.data;
            count++;
            temp = temp.next;
        }
        return -1;
    }

    private int printMiddle() {
        if (head == null) {
            return -1;
        }
        Node fastPtr = head;
        Node slwPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slwPtr = slwPtr.next;
        }
        return slwPtr.data;

    }

    private boolean search(int data) {
        Node temp = head;
        if (temp == null) {
            return false;
        }
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }
        return temp != null;
    }

    private boolean searchRecursive(Node head, int data) {
        Node temp = head;
        if (temp == null) {
            return false;
        }
        if (temp.data == data) {
            return true;
        }
        return searchRecursive(temp.next, data);
    }

    private int size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
//        System.out.println(TAG + "List Size : " + size);
        return size;
    }

    private void deleteKey(int data) {
        Node temp = head;
        Node prev = null;
        if (temp == null) {
            System.out.println(TAG + "List is empty");
            return;
        }
        if (temp.data == data) {
            head = temp.next;
            return;
        }
        while (temp != null && data != temp.data) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println(TAG + "No key found");
            return;
        }
        prev.next = temp.next;
    }

    private void deleteKeyAtPos(int pos) {
        Node temp = head;
        Node prev = null;
        if (temp == null) {
            System.out.println(TAG + "List is empty");
            return;
        }
        if (pos == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; i < pos; i++) {
            if (temp == null)
                break;
            prev = temp;
            temp = temp.next;
        }

        if (prev == null || temp == null) {
            System.out.println(TAG + "Position is invalid");
            return;
        }
        prev.next = temp.next;
    }

    private void createLinkedList() {

        Node first = new Node(1);
        Node sec = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head = first;
        first.next = sec;
        sec.next = third;
        third.next = fourth;
    }

    private void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    private void insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    private void insertAtPosition(int data, int pos) {
        if (pos < 0)
            System.out.println(TAG + "Incorrect Position");
        if (pos == 0)
            insertAtStart(data);
        else {
            if (head == null) {
                head = new Node(data);
                return;
            } else {
                Node temp = head;
                for (int i = 0; i < pos; ++i) {
                    temp = temp.next;
                }
            }
        }
    }


    private void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(TAG + "Item : " + temp.data);
            temp = temp.next;
        }
    }

}
