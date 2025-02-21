/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_1;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class OfflineCourse extends Course{
    private Date begin;
    private Date end;
    private String campus;
    
    public OfflineCourse(){
        super();
        campus = "";
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
    
    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
    
     public void inputAll(String id, String cName, int credit, Date begin, Date end, String campus){
        super.inputAll(id, cName, credit);
        this.begin=begin;
        this.end=end;
        this.campus=campus;
                
    }

    @Override
    public String toString() {
        return super.toString() + "begin=" + begin + ", end=" + end + ", campus=" + campus;
    }
     
     
    
}
