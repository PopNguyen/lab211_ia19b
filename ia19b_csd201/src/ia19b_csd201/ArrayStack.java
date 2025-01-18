/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia19b_csd201;

/**
 *
 * @author ASUS
 */
public class ArrayStack {

   
    class Node{
        int data;
        public Node(int x){
            this.data = x;
        }
    }
    int capacity;
    int lastIdx;
    Node[] arrayNode;
    
    public ArrayStack(int capacity){
        this.capacity=capacity;
        this.arrayNode = new Node[capacity];
        this.lastIdx = -1;
    }
    
    public ArrayStack(){
        this(5);
    }
    boolean isEmpty(){
        return lastIdx == -1;
    }
    boolean isFull(){
        return lastIdx == capacity -1;
    }
    void push(int x){
        if(isFull()) increaseCap();
    }
    void increaseCap() {
        System.arraycopy(this, capacity, this, lastIdx, lastIdx);
    }
}
