/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_1;

/**
 *
 * @author ASUS
 */
public class OnlineCourse extends Course{
    private String platform;
    private String instructors;
    private String note;
    
    public OnlineCourse(){
        super();
        this.platform=this.instructors=this.note="";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    
    
    
    public void inputAll(String id, String cName, int credit, String platform, String instructor, String note){
        super.inputAll(id, cName, credit);
        this.platform=platform;
        this.instructors=instructor;
        this.note=note;
                
    }

    @Override
    public String toString() {
        return super.toString() + "platform=" + platform + ", instructors=" + instructors + ", note=" + note;
    }
    
}
