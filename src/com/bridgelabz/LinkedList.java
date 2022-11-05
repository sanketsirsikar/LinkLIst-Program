package com.bridgelabz;


public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkList is empty");
        } else {
            Node<T> currNode = head;
            while (currNode != null) {
                System.out.println(currNode.getData() + " ");
                currNode = currNode.getNext();
            }
            System.out.println();
        }
    }
}



    