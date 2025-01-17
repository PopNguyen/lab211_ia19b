/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Test {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Test t = new Test();
        t.menu();
    }

    void menu() {
        int choice;
        do {
            System.out.println("================MENU===============");
            System.out.println("1.LetterAndCharaterCount");
            System.out.println("2.LinearSearch");
            System.out.println("3.Change base number system (16, 10, 2) program");
            System.out.println("4.Solving the equation, find the square numbers, even numbers, and odd numbers");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String letter = SolvingTheEquation.input("Enter your content: ");
                    LetterAndCharacterCount obj1 = new LetterAndCharacterCount(letter);
                    System.out.println(obj1.countWord());
                    System.out.println(obj1.countCharater());
                    break;
                case 2:
                    int number = SolvingTheEquation.checkInt("Enter numbers of the array: ");
                    int numberSearch = SolvingTheEquation.checkInt("Enter numbers of you want search: ");
                    LinearSearch obj2 = new LinearSearch(number);
                    obj2.search(numberSearch);
                    break;
                case 3:
                    int choice1 = SolvingTheEquation.checkInt("User choose the base number input ( example 1 is binary, 2 is decimal, 3 is hexadecimal): ");                  
                    int choice2 = SolvingTheEquation.checkInt("User choose the base number output ( example 1 is binary, 2 is decimal, 3 is hexadecimal): ");                  
                    String input = SolvingTheEquation.input("User enter the input value: ");
                    ChangeBaseNumberSystem converter = new ChangeBaseNumberSystem(input);
                    System.out.println("Ouput: ");
                    if (choice1 == 1 && choice2 == 2) {
                        System.out.println(converter.convertBinaryToDecimal());
                    } else if (choice1 == 2 && choice2 == 1) {
                        System.out.println(converter.convertDecimalToBinary());
                    } else if (choice1 == 2 && choice2 == 3) {
                        System.out.println(converter.convertDecimalToHex());
                    } else if (choice1 == 3 && choice2 == 2) {
                        System.out.println(converter.convertHexToDecimal());
                    } else if (choice1 == 1 && choice2 == 3) {
                        System.out.println(converter.convertBinaryToHex());
                    } else if (choice1 == 3 && choice2 == 1) {
                        System.out.println(converter.convertHexToBinary());
                    }
                    break;
                case 4:
                    int option = 0;
                    while (option != 3) {
                        System.out.println("========= Equation Program =========");
                        System.out.println("1. Calculate Superlative Equation");
                        System.out.println("2. Calculate Quadratic Equation");
                        System.out.println("3. Exit");
                        System.out.println("Please choose one option: ");
                        option = sc.nextInt();
                        switch (option) {
                            case 1:
                                float a = SolvingTheEquation.checkFloat("Enter a: ");
                                float b = SolvingTheEquation.checkFloat("Enter b: ");
                                SolvingTheEquation solve1 = new SolvingTheEquation(a, b);
                                System.out.println("Solution: x = " + solve1.calculateEquation());
                                if (solve1.isOdd(a)) {
                                    System.out.println("Number is Odd: a = " + a);
                                } else {
                                    System.out.println("Number is Even: a = " + a);
                                }
                                if (solve1.isOdd(b)) {
                                    System.out.println("Number is Odd: b = " + b);
                                } else {
                                    System.out.println("Number is Even: b = " + b);
                                }
                                if ((solve1.isPerfectSquare(a) && a != 0) || a == 1) {
                                    System.out.println("a is perfect square: " + a);
                                } else{
                                    System.out.println("a is not perfect square!!!");
                                }

                                if ((solve1.isPerfectSquare(b) && b != 0 )|| b == 1) {
                                    System.out.println("b is perfect square:   " + b);
                                } else {
                                    System.out.println("b is not perfect square!!!");
                                }

                                break;
                            case 2:
                                float A = SolvingTheEquation.checkFloat("Enter A: ");
                                float B = SolvingTheEquation.checkFloat("Enter B: ");
                                float C = SolvingTheEquation.checkFloat("Enter C: ");
                                SolvingTheEquation solve2 = new SolvingTheEquation(A, B, C);
                                System.out.println("Solution: x =  " + solve2.calculateQuadraticEquation());
                                if (solve2.isOdd(A)) {
                                    System.out.println("Number is Odd: A = " + A);
                                } else {
                                    System.out.println("Number is Even: A = " + A);
                                }
                                if (solve2.isOdd(B)) {
                                    System.out.println("Number is Odd: B = " + B);
                                } else {
                                    System.out.println("Number is Even: B = " + B);
                                }
                                if (solve2.isOdd(C)) {
                                    System.out.println("Number is Odd: C = " + C);
                                } else {
                                    System.out.println("Number is Even: C =" + C);
                                }
                                if ((solve2.isPerfectSquare(A) && A != 0 )|| A == 1) {
                                    System.out.println("A is perfect square:  " + A);
                                } else {
                                    System.out.println("A is not perfect square!!!");
                                }
                                if ((solve2.isPerfectSquare(B) && B != 0 ) || B == 1) {
                                    System.out.println("B is perfect square:  " + B);
                                } else {
                                    System.out.println("B is not perfect square!!!");
                                }

                                if ((solve2.isPerfectSquare(C) && C != 0 ) || C == 1) {
                                    System.out.println("C is perfect square: " + C);
                                } else {
                                    System.out.println("C is not perfect square!!!");
                                }

                                break;
                            case 3:
                                break;
                        }
                    }
            }
        } while (choice >= 1 && choice <= 4);
    }
}
