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
public class Student {

    private int ID;
    private String Name;
    private String Semester;
    private String courseName;
    private List<Student> arr = new ArrayList<>();

    public Student(int ID, String Name, String Semester, String courseName) {
        this.ID = ID;
        this.Name = Name;
        this.Semester = Semester;
        this.courseName = courseName;
    }

//    @Override
//    public String toString() {
//        return String.format("%.3d | %-10s | %-10s | %-10s", ID, Name, Semester, courseName);
//    }
    void create() {
        Scanner sc = new Scanner(System.in);
        String choose = "Y";
        int i = 0;
        while (choose.equals("Y")) {
            int id = Utils.checkInt("Enter student ID: ");
            String name = Utils.checkString("Enter name student: ");
            String semester = Utils.checkString("Enter semester: ");
            String course = Utils.checkString("Enter courseName: ");
            arr.add(new Student(id, name, semester, course));
            i++;
            if (i >= 3) {
                System.out.println(" Do you want to continue (Y/N)? Choose Y to"
                        + "continue (a student one time), N to return main screen.");
                choose = sc.nextLine();
            }
        }
    }

    void findAndSort() {

    }

    void updateAndDelete(int ID) {

    }

    void display() {
        for(Student n:arr){
            System.out.println("");
        }

    }
}
