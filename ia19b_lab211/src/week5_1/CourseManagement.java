/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CourseManagement {

    Scanner sc = new Scanner(System.in);
    private List<Course> Courses = new ArrayList<>();

    public List<Course> getCourses() {
        return Courses;
    }

    public void setCourses(List<Course> Courses) {
        this.Courses = Courses;
    }
       

    public void addOn(OnlineCourse o) {
        for (Course n : Courses) {
            if (n.courseID.equalsIgnoreCase(o.courseID) || n.courseName.equalsIgnoreCase(o.courseName)) {
                System.out.println("Course ID or Course Name already existed.");
                return;
            }
        }
        Courses.add(o);
    }

    public void add(Course o) {
        Courses.add(o);
    }

    public void addOffline() {
        Date begin, end;
        String courseID = Utils.checkCourse("Enter course id: ");
        String courseName = Utils.checkCourse("Enter course name: ");
        int credit = Utils.checkInt("Enter credit: ");
        sc.nextLine();
        while (true) {
            begin = Utils.checkDate("Enter date begin: ");
            end = Utils.checkDate("Enter date end: ");
            if (Utils.isValid(begin, end)) {
                break;
            }
        }
        String campus = Utils.checkCourse("Enter campus: ");
        OfflineCourse offline = new OfflineCourse();
        offline.inputAll(courseID, courseName, credit, begin, end, campus);
        add(offline);
    }

    public void addOnline() {
        String courseID = Utils.checkCourse("Enter course id: ");
        String courseName = Utils.checkCourse("Enter course name: ");
        int credit = Utils.checkInt("Enter credit: ");
        String platform = Utils.checkCourse("Enter platform: ");
        String instructor = Utils.checkString("Enter instructors: ");
        String note = Utils.checkCourse("Enter note: ");
        OnlineCourse online = new OnlineCourse();
        online.inputAll(courseID, courseName, credit, platform, instructor, note);
        addOn(online);
    }
    public void printAll() {
       for(Course n: Courses){
           System.out.println(n.toString());
       }
    }
    
    public void printOnline(){
        for(Course n: Courses){
            if(n instanceof OnlineCourse){
                System.out.println(n.toString());
            }
        }
    }
    
      public void printOffline(){
        for(Course n: Courses){
            if(n instanceof OfflineCourse){
                System.out.println(n.toString());
            }
        }
    }

    public boolean delete(String idCourse) {

        return false;

    }

    public void update() {

    }
}
