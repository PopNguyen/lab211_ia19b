/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_2;

import java.time.LocalDateTime;

/**
 *
 * @author ASUS
 */
public class Reservation {
    private int bookingID;
    private String customerName;
    private String phoneNumber;
    private int roomNumber;
    private LocalDateTime dateTime;
    private FlightInformation flightInformation;

    public Reservation(int bookingID, String customerName, String phoneNumber, int roomNumber, LocalDateTime bookingDate, FlightInformation flightInformation) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.dateTime=bookingDate;
        this.flightInformation = flightInformation;
    }

    public Reservation() {
        this.bookingID = 0;
        this.customerName = "";
        this.phoneNumber = "";
        this.roomNumber = 0;
        this.dateTime = LocalDateTime.now();
        this.flightInformation = new FlightInformation();
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

   

    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    public void setFlightInformation(FlightInformation flightInformation) {
        this.flightInformation = flightInformation;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingID + ", Customer Name: " + customerName + ", Phone Number: " + phoneNumber + ", Room Number: " + roomNumber + ", DateTime: " + dateTime+ ", Flight Info: [" + flightInformation ;
    }
}
