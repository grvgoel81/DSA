package com.inzy.ds.example;

public class BST {
    private Node root = null;

    class Node {
        Node left, right;
        int key;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    private BST() {
        root = null;
    }

    private void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (root.key > key) {
            root.left = insertRec(root.left, key);
        } else if (root.key < key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    private void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }


    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.inorder();
    }
}
