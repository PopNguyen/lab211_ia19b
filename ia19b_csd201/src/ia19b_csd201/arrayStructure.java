/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia19b_csd201;

import static java.lang.System.exit;

/**
 *
 * @author ASUS
 */
public class arrayStructure {

    int length;
    int capacity;
    int data[];

    public arrayStructure(int size) {
        int arr[] = new int[size];
        this.capacity = size;
        data = arr;
        this.length = 0;
    }

    public arrayStructure() {
        this(5);
    }

    boolean isEmpty() {
        return length == 0;
    }

    boolean isFull() {
        return length == capacity;
    }

    void addLast(int x) {
        if (isFull()) {
            increaseSize();
        }
        data[length] = x;
        length++;
    }

    void increaseSize() {
        int newCapacity = (int) (1.5 * capacity);
        int newArr[] = new int[newCapacity];
        for (int i = 0; i < length; i++) {
            newArr[i] = data[i];
        }
        data = newArr;
        capacity = newCapacity;
    }

    void addFirst(int x) {
        if (isFull()) {
            increaseSize();           
        }
        for (int i = length; i>0;  i--) {
                data[i] = data[i-1];

            }
        data[0]=x;
        length++;
    }
    void display(){
        for(int i=0;i<length;i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println("");
    }
    void addAtIndex(int index ,int x) { 
        if (isFull()) {
            increaseSize();           
        }
        for (int i = length; i>index;  i--) {
                data[i] = data[i-1];

            }
        data[index]=x;
        length++;
    }
    
    

}
