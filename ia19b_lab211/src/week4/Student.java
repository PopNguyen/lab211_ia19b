/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
/**
 *
 * @author ASUS
 */
public class Student{

    private String ID;
    private String Name;
    private String Semester;
    private String courseName;

    public Student(String ID, String Name, String Semester, String courseName) {
        this.ID = ID;
        this.Name = Name;
        this.Semester = Semester;
        this.courseName = courseName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }    
    @Override
    public String toString() {
        return String.format("%-5s | %-10s | %-10s | %-10s", ID, Name, Semester, courseName);
    }
    
   
}
