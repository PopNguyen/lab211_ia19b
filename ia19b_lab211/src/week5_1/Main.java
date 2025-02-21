/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_1;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    static CourseManagement courseManager = new CourseManagement();
    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("*** Course Management ***");
            System.out.println("""
                               1. Add online course/ offline course 
                               2. Update course
                               3. Delete course
                               4. Print all online course / offline course
                               5. Print all course
                               6. Search information base on course name
                               Please enter your option: 
                               """);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("*** Add new course ***");
                    String s = Utils.checkOF("Online (O) or Offline (F): ");
                    if (s.equalsIgnoreCase("O")) {
                        courseManager.addOnline();
                    } else {
                        courseManager.addOffline();
                    }
                    break;
                case 2:

                    break;
                case 3:
                    
                    break;
                case 4:
                    while(true){
                    System.out.println("""
                                       *** Print course ***
                                        Do you want to print all (A), online course (O) or offline course (F):   
                                       """);
                    sc.nextLine();
                    String input = sc.nextLine();
                    if(input.equalsIgnoreCase("A")){
                        courseManager.printAll();
                        break;
                    }else if(input.equalsIgnoreCase("O")){
                        courseManager.printOnline();
                        break;
                    }else if(input.equalsIgnoreCase("F")){
                        courseManager.printOffline();
                        break;
                    }else{
                        System.out.println("Data is invalid.");
                    }
                    }

                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    exit(0);
            }
        }
    }
}
