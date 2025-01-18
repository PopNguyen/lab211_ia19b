/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia19b_csd201;

/**
 *
 * @author ASUS
 */
public class SingLyLinkedList {

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head, tail;

    public SingLyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    // Write a function check list is empty 

    boolean isEmpty() {
        return (head == null);
    }

    // Write a function add a new node to the last of the list 
    void addLast(int x) {
        Node n1 = new Node(x);
        if (isEmpty()) {
            head = tail = n1;
        } else {
            tail.next = n1;
            tail = n1;
        }
    }

    void print() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println("");
    }

    void addFirst(int x) {
        Node n2 = new Node(x);
        if (isEmpty()) {
            head = tail = n2;
        } else {
            Node a = head;
            n2.next = a;
            head = n2;

        }
    }

    void deleteFirst() {
        if (isEmpty()) {
            System.out.println("No elements");
        } else {
            head = head.next;
        }
    }

    void deleteLast() {
        if (isEmpty()) {
            System.out.println("No elements");
        } else if(head==tail) {
            head=tail=null;
        } else{
            Node current = head;
            while(current.next!=tail){
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
    } 
    //Write a function delete a node with specific data onedata and multiple data
    void deleteOneData(int data){
        if(isEmpty()){
            System.out.println("No element");
        }
        else if( head == tail){
            head=tail=null;
        }else{
            if(head.data==data){
                deleteFirst();
                return;
            }
            Node current = head;
            while(current.next != null){
            if(current.next.data == data){
                current.next=current.next.next;
                
            }else{
                current = current.next;
            }
            
        }
    }
    }
}
