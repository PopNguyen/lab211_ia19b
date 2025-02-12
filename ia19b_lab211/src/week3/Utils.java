/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Utils {

    static int checkInt(String msg) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(msg);
                int value = sc.nextInt();
                if (value < 2) {
                    throw new Exception("Error!!!");
                }               
                return value;
            } catch (Exception e) {
                System.out.println("Error!!!");
            }

        }
    }
}
