/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_1;

/**
 *
 * @author ASUS
 */
public class Contact {
    
    private int ID;
    private String fullName;
    private String firstName;
    private String lastName;
    private String group;
    private String address;
    private String phone;
    
    public Contact(int ID, String fullName, String group, String address, String phone) {
        String[] o = fullName.trim().split(" ");
        this.ID = ID;
        this.fullName = fullName;
        this.firstName = o[0];
        this.lastName = o[1];
        this.group = group;
        this.address = address;
        this.phone = phone;
    }
    
    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getGroup() {
        return group;
    }
    
    public void setGroup(String group) {
        this.group = group;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return String.format("%-3s | %-10s | %-6s | %-7s | %-5s | %-7s | %-12s ", ID,fullName,firstName,lastName,group,address,phone);
    }
    
}
