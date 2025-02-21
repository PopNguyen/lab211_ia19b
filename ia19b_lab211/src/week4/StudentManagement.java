/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class StudentManagement {

    private List<Student> studentList;

    public StudentManagement() {
        studentList = new ArrayList<>();
    }

    public List<Student> getArr() {
        return studentList;
    }

    public void setArr(List<Student> arr) {
        this.studentList = arr;
    }

    public boolean checkStudent(Student o) {
        for (Student n : studentList) {
            if (n.getID().equalsIgnoreCase(o.getID()) && n.getName().equalsIgnoreCase(o.getName()) && n.getSemester().equalsIgnoreCase(o.getSemester()) && n.getCourseName().equalsIgnoreCase(o.getCourseName())) {
                return false;
            }
        }
        return true;
    }

    public boolean addStudent(Student o) {
        if (checkStudent(o)) {
            studentList.add(o);
            return true;
        }
        return false;
    }

    public List<Student> findStudentByName(String name) {
        List<Student> listName = new ArrayList<>();
        for (Student n : studentList) {
            if (n.getName().equalsIgnoreCase(name)) {
                listName.add(n);
            }
        }
        return listName;
    }

    void display() {
        for (Student n : studentList) {
            System.out.println(n.toString());
        }

    }

    void update(Student n) {
        n.setID(Utils.checkString("Enter new ID: "));
        n.setName(Utils.checkString("Enter new name:"));
        n.setSemester(Utils.checkString("Enter new Semester: "));
        n.setCourseName(Utils.checkString("Enter new course name: "));
    }

    void updateAndDelete(String id) {
        Scanner sc = new Scanner(System.in);
        for (Student n : studentList) {
            if (n.getID().equalsIgnoreCase(id)) {
                System.out.println(n);
                System.out.println("Do you want to update (U) or delete (D) student");
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("U")) {
                    update(n);
                } else if (input.equalsIgnoreCase("D")) {
                    studentList.remove(n);
                }
            }
        }

    }

    public void sort() {
      Collections.sort(studentList, (Student o1,Student o2)-> o1.getName().compareToIgnoreCase(o2.getName()));
              
    }

    public void report() {
       Map<String,Integer> report = new HashMap<>();
       for(Student n:studentList){
           String key = n.getName() + " | " + n.getCourseName();
           report.put(key, report.getOrDefault(key, 0)+1);
       }
       for(Map.Entry<String,Integer> n : report.entrySet()){
           System.out.println(n.getKey() + " | " + n.getValue());      
    }
    }

}
