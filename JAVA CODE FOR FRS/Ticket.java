package com.company;
import java.text.SimpleDateFormat;
import  java.util.Date;
import  java.text.ParseException;
public  class Ticket {
    private String pnr;
    private float price;
    private String seatNumber;
    private String flightName;
    private Flight flight;
    private Passenger passenger;
    private String departureLocation;
    private String arrivalLocation;
    private String departureDateAndTime;
    private String arrivalDateAndTime;
    private boolean cancelled;

    public Ticket(String pnr, float price,String seatNumber, String flightName, Flight flight, Passenger passenger,
                  String departureLocation, String arrivalLocation, String departureDateAndTime,
                  String arrivalDateAndTime, boolean cancelled) {
        this.pnr = pnr;
        this.seatNumber = seatNumber;
        this.flightName = flightName;
        this.flight = flight;
        this.passenger = passenger;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureDateAndTime = departureDateAndTime;
        this.arrivalDateAndTime = arrivalDateAndTime;
        this.cancelled = cancelled;

    }

    public String getPnr() {
        return pnr;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getDepartureDateAndTime() {
        return departureDateAndTime;
    }

    public void setDepartureDateAndTime(String departureDateAndTime) {
        this.departureDateAndTime = departureDateAndTime;
    }

    public String getArrivalDateAndTime() {
        return arrivalDateAndTime;
    }

    public void setArrivalDateAndTime(String arrivalDateAndTime) {
        this.arrivalDateAndTime = arrivalDateAndTime;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String checkStatus() {
        if (isCancelled() == false) {
            return "confirmed";
        }
        return "cancelled";
    }

    public String flightDuration(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(departureDateAndTime);
            d2 = format.parse(arrivalDateAndTime);
        } catch (ParseException e){
            e.printStackTrace();
        }
        long diff = d2.getTime() - d1.getTime();
        long diffSeconds = diff/1000;
        long diffMinutes = diff/(60*1000) ;
        long diffHours = diff/(60*60*1000) ;
        return diffHours + " " + diffMinutes + " " + diffSeconds ;

    }

    public  void cancel(){
        cancelled = true;
        System.out.println("your ticket get cancelled");
    }


}