/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_3;

import java.math.BigInteger;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("65");
        BigInteger num2 = new BigInteger("8");
        BigInteger sum = num1.add(num2);
        System.out.println("Result: " + sum.toString());
        
        Number n1 = new Number("657");
        Number n2 = new Number("8");
        Number s = n1.addTwoNum(n2);
        System.out.println("Check: "+ s.getValue());

        
        Number a = n1.multiplyTwoNum(n2);
        System.out.println(a.getValue());   
        
        
    }
}
