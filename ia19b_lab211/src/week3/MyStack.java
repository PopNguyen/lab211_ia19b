/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class MyStack {
    Stack<Integer> stack = new Stack<>();
    int stackValues;

    public MyStack() {
    }

    public MyStack(int stackValues) {
        this.stackValues = stackValues;
    }

    public void push(int stackValues) {
        stack.push(stackValues);
    }

    public void pop() {
        System.out.println(stack.pop());
    }

    public void get(int position) {
        System.out.println(stack.get(position));
    }
}
