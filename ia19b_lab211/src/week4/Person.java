/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author ASUS
 */
public class Person {

    private int id;  //6 digits
    private String fullName;  //alphabet and blank
    private String phoneNumber;  //12 digits
    private int yearOfBirth;  //<2025
    private String major; //<=30 character

    public Person() {
        id = 0;
        yearOfBirth = 0;
        fullName = phoneNumber = major = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    

    
    public void inputAll(){
        id = Utils.checkID("Enter ID: ");
        fullName = Utils.checkName("Enter full name:");
        phoneNumber = Utils.checkPhone("Enter phone number:");
        yearOfBirth = Utils.checkYearBirth("Enter year of birth:");
        major = Utils.checkMajor("Enter major: ");
        
        
    }
    @Override
    public String toString() {
        return "id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", yearOfBirth=" + yearOfBirth + ", majot=" + major;
    }

}
