/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PersonManagement {

    List<Teacher> listTeacher = new ArrayList<>();
    List<Student2> listStudent = new ArrayList<>();
    List<Person> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public PersonManagement() {

    }

    void menuTeacher() {
        int choice=0;
        while (choice<3) {
            System.out.println("*** Teacher Management ***");
            System.out.println("""
                           1. Input
                           2. Print
                           3. Exit
                           Please enter your choice:
                           """);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter number teacher you want enter: ");
                    int num = sc.nextInt();
                    while (num != 0) {
                        Teacher t = new Teacher();
                        t.inputAll();
                        list.add(t);
                        num--;
                    }
                    break;
                case 2:
                    for (Person t : list) {
                        if (t instanceof Teacher) {
                            System.out.println(t);
                        }
                    }
                    break;
                case 3:
                    break;
            }
        }

    }

    void menuStudent() {
        int choice=0;
        while (choice<3) {
            System.out.println("*** Student Management ***");
            System.out.println("""
                           1. Input
                           2. Print
                           3. Exit
                           Please enter your choice:
                           """);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter number student you want enter: ");
                    int num = sc.nextInt();
                    while (num != 0) {
                        Student2 s = new Student2();
                        s.inputAll();
                        list.add(s);
                        num--;
                    }
                    break;
                case 2:
                    for (Person s : list) {
                        if (s instanceof Student2) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 3:
                    break;
            }
        }

    }

    void menuPerson() {
        int choice=0;
        while (choice<3) {
            System.out.println("*** Person Management ***");
            System.out.println("""
                           1. Search
                           2. PrintAll
                           3. Exit
                           Please enter your choice:
                           """);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String name = Utils.checkString("Enter name you want to search: ");
                    for (Person p : list) {
                        if (p.getFullName().trim().equalsIgnoreCase(name.trim())) {
                            System.out.println(p);
                        }else{
                            System.out.println("Not found!!!");
                        }
                    }

                    break;
                case 2:
                    for (Person p : list) {
                        System.out.println(p.getId()+" | " + p.getFullName() +" | " + p.getPhoneNumber()+" | " + p.getYearOfBirth()+" | " + p.getMajor());
                    }
                case 3:
                    break;
            }
        }

    }
}
