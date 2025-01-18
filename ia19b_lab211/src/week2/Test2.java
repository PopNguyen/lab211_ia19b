/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import static java.lang.System.exit;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Test2 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Test2 menu = new Test2();
        menu.menu();

    }

    void menu() throws Exception {
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
                    int choice = 0;
                    while (choice < 3) {
                        System.out.println("""
                           ========= Calculator Program =========
                           1. Normal Calculator
                           2. BMI Calculator
                           3. Exit
                           Please choice one option:""");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                doCalculator();
                                break;
                            case 2:
                                docalculatorBMI();
                                break;
                            case 3:
                                break;

                        }
                    }
                    break;
                case 2:
                    System.out.println("==========Calculator Shape Program===========");
                    doCalculatorShape();
                    break;
                case 3:
                    int op = 0;
                    Matrix matrix = new Matrix();
                    while (op != 4) {
                        System.out.println("1. Addition Matrix");
                        System.out.println("2. Subtraction Matrix");
                        System.out.println("3. Multiplication Matrix");
                        System.out.println("4. Quit");
                        System.out.print("Enter your choice: ");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                Matrix.additionMatrix(createMatrix1(), createMatrix2());
                                break;
                            case 2:
                                Matrix.subtractionMatrix(createMatrix1(), createMatrix2());
                                break;
                            case 3:
                                Matrix.multiplicationMatrix(createMatrix1(), createMatrix2());
                                break;
                            case 4:
                                break;
                        }
                    }
                    break;
                case 4:
                    exit(0);
                    break;
            }
        }
    }

    Matrix createMatrix1() {
        int row1 = checkInputInt("Enter Row Matrix 1 :  ");
        int col1 = checkInputInt("Enter Colum Matrix 1 :  ");
        Matrix matrix1 = new Matrix(row1, col1);
        matrix1.inputMatrix();
        return matrix1;
    }

    Matrix createMatrix2() {
        int row2 = checkInputInt("Enter Row Matrix 2 :  ");
        int col2 = checkInputInt("Enter Colum Matrix 2 :  ");
        Matrix matrix2 = new Matrix(row2, col2);
        matrix2.inputMatrix();
        return matrix2;
    }

    static void doCalculatorShape() {
        double width = checkInput("Please input side width of Rectangle:");
        double length = checkInput("Please input side length of Rectangle:");
        Rectangle rec = new Rectangle(width, length);
        rec.printResult();
        double radius = checkInput("Please input radius of Circle: ");
        Circle ci = new Circle(radius);
        ci.printResult();
        double sideA = checkInput("Please input side A of Triangle: ");
        double sideB = checkInput("Please input side B of Triangle: ");
        double sideC = checkInput("Please input side C of Triangle:");
        Triangle tri = new Triangle(sideA, sideB, sideC);
        tri.printResult();
    }

    static void doCalculator() throws Exception {
        Scanner sc = new Scanner(System.in);
        CalculatorProgram cal = new CalculatorProgram();
        double num1 = checkInput("Input your number: ");
        double temp = num1;
        while (true) {
            String op = checkOperator("Enter your operation: ");
            if (op.equals("=")) {
                System.out.println("Final result:" + temp);
                return;
            }
            double num2 = checkInput("Input your number: ");
            temp = cal.calculatorNormal(temp, op, num2);
            System.out.println("Memory:" + temp);
        }
    }

    static void docalculatorBMI() {
        Scanner sc = new Scanner(System.in);
        CalculatorProgram calBMI = new CalculatorProgram();
        double weight = checkInput("Enter your weight in kg: ");
        double height = checkInput("Enter your height in cm: ");
        System.out.println(calBMI.calculatorBMI(weight, height));

    }

    static String checkOperator(String msg) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(msg);
                String op = sc.nextLine();
                if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("=")) {
                    return op;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Your operation not valid. Please re-enter your operation");
            }
        }
    }

    static double checkInput(String msg) {
        Scanner sc = new Scanner(System.in);
        double input = 0;
        while (true) {
            try {
                System.out.print(msg);
                input = sc.nextDouble();
                if (input <= 0) {
                    System.out.println("Your input must be > 0");
                } else {
                    return input;
                }
            } catch (InputMismatchException e) {
                System.out.println("Your input not valid");
                sc.nextLine();
            }
        }
    }

    static int checkInputInt(String msg) {
        Scanner sc = new Scanner(System.in);
        int input;
        while (true) {
            try {
                System.out.println(msg);
                input = sc.nextInt();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Values of matrix must be the number. ");
                sc.nextLine();  // Prevent infinite
            } catch (Exception e) {
                System.out.println("Your input not valid. ");
                sc.nextLine();
            }

        }
    }

}
