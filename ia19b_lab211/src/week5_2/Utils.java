/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_2;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Utils {
    static Scanner sc = new Scanner(System.in);
      
    static String checkName(String msg) {
        while (true) {
            String input;
            try {
                System.out.println(msg);
                input = sc.nextLine();
                if (!(input.trim().matches("[a-zA-Z ]+"))) {
                    throw new Exception("Input not valid.");
                }
                return input;
            } catch (Exception e) {
                System.out.println("Input not valid.");
            }

        }
    }
    
    static String checkPhone(String msg) {
        while (true) {
            String input;
            try {
                System.out.println(msg);
                input = sc.nextLine();
                if (!(input.matches("\\d{12}"))) {
                    throw new Exception("Input not valid.");
                }
                return input;
            } catch (Exception e) {
            }

        }
    }

    
    static int checkID(String msg) {
        while (true) {
            int v = 0;
            try {
                System.out.println(msg);
                v = sc.nextInt();
                sc.nextLine();
                if (!(v>99999&&v<1000000)) {
                    throw new Exception("Error");
                }
                return v;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();

            }

        }
    }
    
     static int checkRoom(String msg) {
        while (true) {
            int v;
            try {
                System.out.println(msg);
                v = sc.nextInt();
                sc.nextLine();
                if (v<1000||v>9999) {
                    throw new Exception("Error");
                }
                return v;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();

            }

        }
    }

    static LocalDateTime checkBookingDate(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    static LocalDateTime checkTimePickUp(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static String checkString(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }

    
    
}
