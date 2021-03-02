package com.company;

public class RegularTicket extends Ticket{
     String specialServices;

     public RegularTicket(String pnr, float price, String seatNumber, String flightName, Flight flight, Passenger passenger,
                          String departureLocation, String arrivalLocation,String departureDateAndTime,
                         String arrivalDateAndTime, boolean cancelled, String specialServices) {
          super(pnr, price, seatNumber, flightName, flight, passenger, departureLocation, arrivalLocation, departureDateAndTime,
                  arrivalDateAndTime, cancelled) ;
     }
     public String getSpecialServices(){
          return  this.specialServices;
     }
     public  void updateSpecialServices(String specialServices){
this.specialServices = specialServices;
     }
}
