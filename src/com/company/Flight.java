package com.company;

public class Flight {
    private  String flightNumber;
    private String airLine;
    private  int capacity;
    private  int bookedSeats;

    public  Flight (String flightNumber , String airLine ,int capacity, int bookedSeats){
        this.flightNumber = flightNumber;
        this.airLine = airLine;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public String getFlightNumber(){ return flightNumber; }
    public  void setFlightNumber(String flightNumber){ this.flightNumber = flightNumber ; }
    public String getAirLine() { return airLine; }                                      // getters and setters
    public void setAirLine(String airLine) { this.airLine = airLine; }
    public int getCapacity() { return capacity;}
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public int getBookedSeats() { return bookedSeats; }
    public void setBookedSeats(int bookedSeats) { this.bookedSeats = bookedSeats; }

    public  boolean checkAvailability(){
        if(capacity>0){
            return  true;
        }
        return false;
    }
    public int incrementBookingCounter(){
        bookedSeats = ++bookedSeats;
        return bookedSeats;
    }

    public String getFlightDetails(){
       return "flight number : " + getFlightNumber() + " airline name : " + getAirLine()
               +"capacity :" + capacity + "booked seats :" + bookedSeats;
    }
}
