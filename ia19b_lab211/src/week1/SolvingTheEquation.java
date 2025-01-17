/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SolvingTheEquation {

    private float a;
    private float b;
    private float c;

    public SolvingTheEquation() {

    }

    public SolvingTheEquation(float a, float b) {
        this.a = a;
        this.b = b;

    }

    public SolvingTheEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public List<Float> calculateEquation() {
        if (a == 0) {
            if (b == 0) {
                return new ArrayList<>();
            } else {
                return null;
            }
        } else {
            List<Float> result = new ArrayList<>();
            result.add(-b / a);
            return result;
        }
    }

    public List<Float> calculateQuadraticEquation() {
        if (a == 0 && b == 0 && c == 0) {
            return new ArrayList<>();
        }
        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            return null;
        } else if (delta == 0) {
            List<Float> result = new ArrayList<>();
            result.add(-b / (2 * a));
            return result;
        } else {
            List<Float> result = new ArrayList<>();
            result.add((-b + (float) Math.sqrt(delta)) / (2 * a));
            result.add((-b - (float) Math.sqrt(delta)) / (2 * a));
            return result;
        }

    }

    public static String input(String msg) {

        System.out.print(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    public static float checkFloat(String msg) {
        float v = 0;
        while (true) {
            try {

                v = Float.parseFloat(input(msg));
                if (v < 0) {
                    throw new Exception("Number must > 0");
                }
                return v;
            } catch (Exception e) {
                System.out.println("Your input not valid!!! ");
            }

        }
    }
     public static int checkInt(String msg) {
        int v = 0;
        while (true) {
            try {

                v = Integer.parseInt(input(msg));
                if (v < 0) {
                    throw new Exception("Number must > 0");
                }
                return v;
            } catch (Exception e) {
                System.out.println("Your input not valid!!! ");
            }

        }
    }

    boolean isOdd(float number) {
        return (number % 2 != 0);

    }

    public boolean isPerfectSquare(float number) {
        return Math.sqrt(number) % 2 == 0;

    }

}
