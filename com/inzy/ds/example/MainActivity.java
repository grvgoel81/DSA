package com.inzy.ds.example;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.inzy.ds.R;

public class MainActivity extends AppCompatActivity {

    private String TAG = "LINKEDLIST";

    Node head = null;
    TextView print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        print = findViewById(R.id.print);
        createLinkedList();
        insertAtStart(0);
        insertAtEnd(5);
        insertAtPosition(10, 0);
        traverse();
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
            Log.d(TAG, "Incorrect Position");
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
            Log.d(TAG, "Item : " + temp.data);
            print.append("Item : " + temp.data + "\n");
            temp = temp.next;
        }
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}