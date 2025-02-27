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
        for (Course n : Courses) {
            System.out.println(n.toString());
        }
    }

    public void printOnline() {
        for (Course n : Courses) {
            if (n instanceof OnlineCourse) {
                System.out.println(n.toString());
            }
        }
    }

    public void printOffline() {
        for (Course n : Courses) {
            if (n instanceof OfflineCourse) {
                System.out.println(n.toString());
            }
        }
    }

    public boolean delete(String idCourse) {
        for (Course n : Courses) {
            if (n.courseID.equalsIgnoreCase(idCourse)) {
                Courses.remove(n);
                return true;
            }
        }
        return false;
    }

    public boolean find(String idCourse) {
        for (Course n : Courses) {
            if (n.courseID.equalsIgnoreCase(idCourse)) {
                return true;
            }
        }
        return false;
    }

    public Course searchName(String nameCourse) {
        for (Course n : Courses) {
            if (n.courseName.equalsIgnoreCase(nameCourse)) {
                return n;
            }
        }
        return null;
    }

    public void update(String idCourse) {
        for (Course n : Courses) {
            if (n.courseID.equalsIgnoreCase(idCourse)) {
                System.out.println(n);
                System.out.println("*** Updating ***");
                if (n instanceof OnlineCourse) {
                    ((OnlineCourse) n).setCourseID(Utils.checkCourse("Enter new course id: "));
                    ((OnlineCourse) n).setCourseName(Utils.checkCourse("Enter new course name"));
                    ((OnlineCourse) n).setCredits(Utils.checkInt("Enter new credits: "));
                    ((OnlineCourse) n).setPlatform(Utils.checkCourse("Enter new platform: "));
                    ((OnlineCourse) n).setInstructors(Utils.checkString("Enter new instructors"));
                    ((OnlineCourse) n).setNote(Utils.checkCourse("Enter new notde"));
                }
                if (n instanceof OfflineCourse) {
                    ((OfflineCourse) n).setCourseID(Utils.checkCourse("Enter new course id: "));
                    ((OfflineCourse) n).setCourseName(Utils.checkCourse("Enter new course name"));
                    ((OfflineCourse) n).setCredits(Utils.checkInt("Enter new credits: "));
                    while (true) {
                        ((OfflineCourse) n).setBegin(Utils.checkDate("Enter date begin: "));
                        ((OfflineCourse) n).setEnd(Utils.checkDate("Enter date end: "));
                        if (Utils.isValid(((OfflineCourse) n).getBegin(), ((OfflineCourse) n).getEnd())) {
                            break;
                        }
                    }

                }
            }
        }
    }
}
