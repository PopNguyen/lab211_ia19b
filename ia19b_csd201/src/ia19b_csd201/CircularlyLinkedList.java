/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia19b_csd201;

/**
 *
 * @author ASUS
 */
public class CircularlyLinkedList {

    class Node {

        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this(data, null);
        }
    }
    Node tail;

    public CircularlyLinkedList() {

    }

    boolean isEmpty() {
        return tail == null;
    }

    void addLast(int x) {
        Node n1 = new Node(x);
        if (isEmpty()) {
            // tail = new Node(x,tail);
            tail = new Node(x);
            tail.next = tail;
        } else {
            tail.next = new Node(x, tail.next);
            tail = tail.next;
        }
    }

    void addFirst(int x) {
        Node n = new Node(x);
        if (isEmpty()) {
            tail = new Node(x);
            tail.next = tail;

        } else {
            tail.next = new Node(x, tail.next);

        }
    }

    void traverse() {
        if (isEmpty()) {
            System.out.println("No element");
        } else {
            Node current = tail.next;
            do {
                System.out.print(current.data + "   ");
                current = current.next;
            } while (current != tail.next);

        }
        System.out.println("");
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("No element");
        } else {
            if (tail == tail.next) {
                tail = null;
            } else {
                Node current = tail.next;
                while (current.next != tail) {
                    current = current.next;
                }
                current.next = tail.next;
                tail = current;
            }
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("No element");
        } else {
            if (tail == tail.next) {
                tail = null;
            } else {
                tail.next = tail.next.next;
            }
        }
    }

}
