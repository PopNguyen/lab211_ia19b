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
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonManagement pMg = new PersonManagement();
        while(true){
        System.out.println("*** Information Management ***");
            System.out.println("""
                               1. Teacher
                               2. Student
                               3. Person
                               4. Exit
                               Please enter your choice:
                               """);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    pMg.menuTeacher();
                    break;
                case 2:
                    pMg.menuStudent();
                    break;
                case 3:
                    pMg.menuPerson();  
                    break;
                case 4:
                    exit(0);
                    break;
            }
        }
    }
}
