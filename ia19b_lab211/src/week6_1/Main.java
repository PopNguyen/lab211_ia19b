/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_1;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        ContactManagement cMg = new ContactManagement();
        while (true) {
            System.out.println("""
                               ========= Contact program =========
                               1. Add a Contact
                               2. Display all Contact
                               3. Delete a Contact
                               4. Exit
                               Please enter your choice:""");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String name = ContactManagement.checkString("Enter name contact: ");
                    String group = ContactManagement.checkString("Enter group contact: ");
                    String address = ContactManagement.checkString("Enter address: ");
                    String phone = ContactManagement.checkString("Enter your phone: ");
                    cMg.add(new Contact(cMg.countID(), name, group, address, phone));
                    break;
                case 2:
                    System.out.println("ID    Name     First Name    Last Name    Group   Address     Phone");
                    cMg.display();
                    break;
                case 3:
                    System.out.println("Enter your id you want delete: ");
                    int idDelete = sc.nextInt();
                    if(cMg.delete(idDelete)) System.out.println("Contact has been deleted");
                    else System.out.println("No found contact");
                    break;
                case 4:
                    exit(0);
            }
        }
    }
}
