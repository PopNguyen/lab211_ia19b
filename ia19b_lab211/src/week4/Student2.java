/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author ASUS
 */
public class Student2 extends Person{
    private int yearAdmission;   // between birthyear to current year
    private int entraceEnglishScore;  // >=0 <=100
    
    public Student2(){
        yearAdmission = 0;
        entraceEnglishScore = 0;
    }

    public int getYearAdmission() {
        return yearAdmission;
    }

    public void setYearAdmission(int yearAdmission) {
        this.yearAdmission = yearAdmission;
    }

    public int getEntraceEnglishScore() {
        return entraceEnglishScore;
    }

    public void setEntraceEnglishScore(int entraceEnglishScore) {
        this.entraceEnglishScore = entraceEnglishScore;
    }
    
    
    
    @Override
    public void inputAll(){
        super.inputAll();
        int yearAd = Utils.checkYearAdmission("Enter year admission:");
        int score = Utils.checkScore("Enter score:");
    }

    @Override
    public String toString() {
        return super.toString() + "yearAdmission=" + yearAdmission + ", entraceEnglishScore=" + entraceEnglishScore ;
    }
    
    
}
