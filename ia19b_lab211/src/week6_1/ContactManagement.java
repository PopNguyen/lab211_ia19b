/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ContactManagement {
    static Scanner sc = new Scanner(System.in);
    List<Contact> contactList = new ArrayList<>();

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
    
    void add(Contact c){
        contactList.add(c);
    }
    
    public void display(){
        for(Contact n:contactList){
            System.out.println(n);
        }
    }
    
    public boolean delete(int id){
        for(Contact n:contactList){
            if(n.getID()==id){
                contactList.remove(n);
                return true;
            }
        }
        return false;
    }
    
    
    static String checkString(String msg){
        System.out.println(msg);
        return sc.nextLine();
    }
    
    static int checkInt(String msg){
        while(true){
            int v;
            try {
                System.out.println(msg);
                v = sc.nextInt();
                if(v<=0) throw new Exception("Value must be > 0 !");
                return v;
            } catch (Exception e) {
                System.out.println("Value must be > 0 !");
            }
        }
    }
//    static String checkPhone(String msg){
//        try {
//            String s = checkString(msg);
//            if(s.matches("\\d{10}")){
//                
//            }
//        } catch (Exception e) {
//        }
//    }

    public int countID() {
        int flag=0;
        for(Contact n:contactList){
            flag++;
        }
        return ++flag;
    }
}
