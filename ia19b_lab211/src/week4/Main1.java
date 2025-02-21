/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main1 {

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        StudentManagement smg = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                               ================MENU===============
                               1. Create students
                               2. Display students
                               3. Find student
                               4. Sort student
                               5. Update and delete student
                               6. Report student
                               7. Exit
                               Please enter your option: """);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String choose = "Y";
                    int i = 1;
                    while (true) {
                        System.out.println("===Student "+ i + "===");
//                        String id = Utils.checkString("Enter student ID: ");
//                        String name = Utils.checkString("Enter name student: ");
//                        String semester = Utils.checkString("Enter semester: ");
//                        String course = Utils.checkString("Enter courseName: ");
                        smg.addStudent(new Student("1", "A", "SU23", "JAVA"));
                        smg.addStudent(new Student("2", "B", "SU24", "JAVA"));
                        smg.addStudent(new Student("3", "C", "SU25", "JAVA"));
                        smg.addStudent(new Student("4", "B", "SU26", ".Net"));
                        i++;
                        if (i > 3) {
                            System.out.println("Do you want to continue (Y/N)?");
                            System.out.println("Choose Y to continue (a student one time), N to return main screen.");
                            sc.nextLine();
                            choose = sc.nextLine();
                        }
                        if(choose.equalsIgnoreCase("N")) break;
                    }
                    break;
                case 2:
                    smg.display();
                    break;
                case 3:
                    System.out.println(smg.findStudentByName(Utils.checkString("Enter name that want find: ")));
                    break;
                case 4:
                    smg.sort();
                    smg.display();
                    break;
                case 5:
                    String id = Utils.checkString("Enter id student you want update/delete:");
                    smg.updateAndDelete(id);
                    break;
                case 6:
                    smg.report();
                    break;
                case 7:
                    exit(0);             
            }
        }
    }
}
