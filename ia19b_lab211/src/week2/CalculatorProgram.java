/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CalculatorProgram {

    Scanner sc = new Scanner(System.in);
    private double memory;

    public CalculatorProgram() {
        this.memory = 0;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    double calculatorNormal(double num1, String operator, double num2) {
        while (true) {
            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    return (num1 / num2);
                case "^":
                    return Math.pow(num1, num2);
            }
        }
    }

   

    String calculatorBMI(double weight, double height) {
        height = height/100;
        double bmi = weight / (height * height);
        if(bmi<19){
            System.out.println(bmi);
            return "Under-standard";
        }else if(bmi<25){
            System.out.println(bmi);
            return "Standard";
        }else if(bmi<30){
            return "Overweight";
        }else if(bmi<40){
            return "Fat - should lose weight";
        }else{
            return "Very fat - must lose weight immediately";
        }      
    }

    
}
