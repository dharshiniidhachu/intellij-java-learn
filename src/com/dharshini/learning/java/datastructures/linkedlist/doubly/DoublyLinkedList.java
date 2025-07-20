package com.dharshini.learning.java.datastructures.linkedlist.doubly;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void delete(int key) {
        Node temp = head;
        if(temp!=null && temp.data == key) {
            head = temp.next;
            if(head!=null)
                head.prev=null;
            return;
        }
        while (temp!=null&&temp.data!=key) {
            temp = temp.next;
            System.out.println("Key found : " + temp.data);
        }

        if (temp==null)
            return;

        if(temp==tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

    }

    public void printForward() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + "⇄");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Node temp = tail;
        while (temp!=null) {
            System.out.print(temp.data + "⇄");
            temp = temp.prev;
        }
        System.out.println("null");}


    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertEnd(10);
        dl.insertEnd(20);
        dl.insertEnd(30);
        dl.insertBeginning(5);
        System.out.println("Printing Forward");
        dl.printForward();
        System.out.println("Printing Backward");
        dl.printBackward();
        dl.delete(20);
        System.out.println("After Deleting");
        dl.printForward();
        System.out.println("Printing Backward");
        dl.printBackward();
    }
}