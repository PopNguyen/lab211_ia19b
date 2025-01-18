/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia19b_csd201;

/**
 *
 * @author ASUS
 */
public class DoubleLinkedList {

    class Node {

        int data;
        Node next, pre;

        public Node(int x, Node pre, Node next) {
            this.data = x;
            this.pre = pre;
            this.next = next;
        }

        public Node(int x) {
            this.data = x;
            this(x, null, null);
        }

    }
    Node head, tail;

    public DoubleLinkedList() {
        head = tail = null;
    }

    //check whether the list is empty
    boolean isEmpty() {
        return head == null;
    }

    //write a function add last
    void addLast(int x) {
        Node n1 = new Node(x);
        if (isEmpty()) {
            head = tail = n1;
        } else {
            tail.next = new Node(x, tail, null);
            tail = tail.next;
        }

    }

    void addFirst(int x) {
        Node n1 = new Node(x);
        if (isEmpty()) {
            head = tail = n1;
        } else {
            head.pre = new Node(x, null, head);
            head = head.pre;
        }

    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("No element");

        } else if (head == tail) {
            head = tail = null;

        } else {

            tail = tail.pre;
            tail.next = null;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("No element");
        } else if (head == tail) {
            head = tail = null;
        } else {

            head = head.next;
            head.pre = null;
        }
    }

    void removeData(int x) {
        if (isEmpty()) {
            System.out.println("No element");
        } else {
            Node current = head;
            while (current.next != tail) {
                if (current.next.data == x) {
                    current.next = current.next.next;
                    current.next.pre = current;
                } else {
                    current = current.next;
                }
            }                       
        }
        if(head == tail){
            if(head.data == x){
                head = tail = null;
            }
        }
    }

    void traverse() {
        if (isEmpty()) {
            System.out.println("the list is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "   ");
                current = current.next;
            }
            System.out.println("");
        }
    }

    void backTraverse() {
        if (isEmpty()) {
            System.out.println("the list is empty");
        } else {
            Node current = tail;
            while (current != null) {
                System.out.print(current.data + "   ");
                current = current.pre;
            }
        }
    }

}
