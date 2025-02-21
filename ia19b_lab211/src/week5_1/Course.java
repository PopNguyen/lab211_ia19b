/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_1;

/**
 *
 * @author ASUS
 */
public class Course {
    protected String courseID;
    protected String courseName;
    protected int credits;

    public Course() {
        this.courseID = "";
        this.courseName = "";
        this.credits = 0;
    }
    
    
    public void inputAll(String id,String cName, int credit){
        this.courseID=id;
        this.courseName=cName;
        this.credits=credit;
    }

    @Override
    public String toString() {
        return "courseID=" + courseID + ", courseName=" + courseName + ", credits=" + credits;
    }
    
    
    
    
    
    
    
}
