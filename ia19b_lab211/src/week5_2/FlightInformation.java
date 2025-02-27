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
public class FlightInformation {
    private String flightNumber;
    private String seatNumber;
    private LocalDateTime timePickup;
    
    public FlightInformation(){
        flightNumber=seatNumber="";
        timePickup=LocalDateTime.now();
    }
    
    public FlightInformation(String flightNumber,String seatNumber, LocalDateTime timePickUp){
        this.flightNumber=flightNumber;
        this.seatNumber=seatNumber;
        this.timePickup=timePickUp;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDateTime getTimePickup() {
        return timePickup;
    }

    public void setTimePickup(LocalDateTime timePickup) {
        this.timePickup = timePickup;
    }

    @Override
    public String toString() {
        return  "flightNumber=" + flightNumber + ", seatNumber=" + seatNumber + ", timePickup=" + timePickup;
    }
    
}
