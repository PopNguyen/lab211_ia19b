/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ReservationManagement {

    List<Reservation> reservationList = new ArrayList<>();

    public boolean checkID(int id) {
        for (Reservation n : reservationList) {
            if (n.getBookingID() == id) {
                return false;
            }
        }
        return true;
    }

    void input(int id, String name, String phone, int room, LocalDateTime bookingDate, FlightInformation flight) {
        reservationList.add(new Reservation(id, name, phone, room, bookingDate, flight));

    }
    
    void delete(){
        
    }
    
    void update(){
        
    }

    void printAll() {
        for (Reservation n : reservationList) {
            System.out.println(n);
        }
    }

    void printFlightTicket() {
        for (Reservation n : reservationList) {
            System.out.println(n.getFlightInformation());
        }
    }

}
