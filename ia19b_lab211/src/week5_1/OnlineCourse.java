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
