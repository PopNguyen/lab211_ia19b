/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_2;

import static java.lang.System.exit;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {

    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        ReservationManagement rMg = new ReservationManagement();
        while (true) {
            System.out.println("*** Reservation Management ***");
            System.out.println("""
                               1. Create new reservation
                               2. Update reservation
                               3. Delete reservation
                               4. Print Flight Information
                               5. Print all
                               6. Exit.
                               Please enter your option: 
                               """);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("*** Create new reservation ***");
                    int id;
                    while (true) {
                        id = Utils.checkID("Enter ID: ");
                        if(rMg.checkID(id)) break;
                        else System.out.println("This id is existed. Please re-enter: ");
                    }
                    String name = Utils.checkName("Enter name: ");
                    String phone = Utils.checkPhone("Enter phone number: ");
                    int room = Utils.checkRoom("Enter room number: ");
                    LocalDateTime bookingDate = Utils.checkBookingDate("Enter booking date: ");
                    FlightInformation flight;
                    while(true){
                    System.out.println("Need airport pick up? (Y/N):");
                    String choose = sc.nextLine();
                    if(choose.equalsIgnoreCase("Y")){
                        String flightNum = Utils.checkString("Enter flight number: ");
                        String seatNum = Utils.checkString("Enter seat number: ");
                        LocalDateTime timePickUp = Utils.checkTimePickUp("Enter time pick up: ");
                        flight = new FlightInformation(flightNum, seatNum, timePickUp);
                        break;
                    }else if(choose.equalsIgnoreCase("N")){
                        flight = new FlightInformation();
                        break;
                    }else System.out.println("Data input is invalid");
                    }                   
                    rMg.input(id, name, phone, room, bookingDate, flight);
                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    exit(0);
            }
        }
    }
}
