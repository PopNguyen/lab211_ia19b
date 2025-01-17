/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Test2 menu = new Test2();
        menu.menu();

    }

    void menu() throws Exception {
        Scanner sc = new Scanner(System.in);
        int option;
        while (true) {
            System.out.println("""
                               ================MENU===============
                               1. Develop a computer program
                               2. Create a program to calculate perimeter and area
                               3. Matrix
                               4. Exit
                               Please enter your option: """);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    int choice;
                    System.out.println("""
                           ========= Calculator Program =========
                           1. Normal Calculator
                           2. BMI Calculator
                           3. Exit
                           Please choice one option:""");
                    choice = sc.nextInt();
                    while (choice < 3) {
                        switch (choice) {
                            case 1:
                                doCalculator();
                                break;
                            case 2:
                                calculatorBMI();
                                break;
                            case 3:
                                break;

                        }
                    }
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    exit(0);
                    break;
            }
        }
    }

    static void doCalculator() throws Exception {
        Scanner sc = new Scanner(System.in);
        calculatorProgram cal = new calculatorProgram();
        System.out.println("Input your number: ");
        double num1 = sc.nextDouble();
        double temp = num1;
        while (true) {
            String op = cal.checkOperator("Enter your operation: ");
            if (op.equals("=")) {
                System.out.println("Final result:" + temp);
                return;
            }
            System.out.println("Input your number: ");
            double num2 = sc.nextDouble();
            temp = cal.calculatorNormal(temp, op, num2);
            System.out.println("Memory:" + temp);
        }
    }

    static void calculatorBMI() {
        Scanner sc = new Scanner(System.in);
        calculatorProgram calBMI = new calculatorProgram();
        double weight = calBMI.checkInput("Enter your weight in kg: ");
        double height = calBMI.checkInput("Enter your height in cm: ");
        System.out.println(calBMI.calculatorBMI(weight, height));

    }
}
