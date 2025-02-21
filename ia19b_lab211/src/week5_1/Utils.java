/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Utils {

    static Scanner sc = new Scanner(System.in);

    static int checkInt(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                int value = sc.nextInt();
                sc.nextLine();
                if (value < 0) {
                    throw new Exception("Error!!!");
                }
                return value;
            } catch (Exception e) {
                System.out.println("Error!!!");
            }

        }
    }

    static String checkCourse(String msg) {
        while (true) {
            String s;
            try {
                System.out.println(msg);
                s = sc.nextLine();
                if (s.isEmpty()) {
                    throw new Exception("Data input is invalid");
                }
                return s;
            } catch (Exception e) {
                System.out.println("Data input is invalid.");
            }
        }
    }

    static Date checkDate(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        while (true) {
            String s;
            try {
                System.out.println(msg);
                s = sc.nextLine();
                return dateFormat.parse(s);
            } catch (ParseException e) {
                System.out.println("“Data input is invalid”");
            }
        }
    }

    static boolean isValid(Date begin, Date end) {
        try {
            return end.after(begin);
        } catch (Exception e) {
            System.out.println("Data input is invalid, end must be after begin");
            return false;
        }
    }

    static String checkOF(String msg) {
        while (true) {
            String s;
            try {
                System.out.println(msg);
                s = sc.nextLine();
                if (!(s.equalsIgnoreCase("O") || s.equalsIgnoreCase("F"))) {
                    throw new Exception();
                }
                return s;
            } catch (Exception e) {
                System.out.println("Data input is invalid.");
            }
        }
    }

    static String checkString(String msg) {
        System.out.println(msg);
        String s = sc.nextLine();
        return s;

    }

}
