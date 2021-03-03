package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Passenger passenger1 = new Passenger( "king 12 street","VIZAG","AndhraPradesh","naveen simma",
                "simmanaveen1234@gmail.com","9989818428");

        Passenger passenger2 = new Passenger( "queen street 123","VIZAG","AndhraPradesh","naveena",
                "example@gmail.com ","9876543210");


        Flight flight1 = new Flight("AP210D","AIRJET",50, 20);

        RegularTicket regularTicket = new RegularTicket("12345", 1500.00f,"24D" ,"SPICE JET",flight1,
                passenger1 , "DELHI","VIZAG" ,"2/3/2021 10:30:30",
                "2/3/2021 12:30:30", false , "Fried Rice");

        TouristTicket touristTicket = new TouristTicket("23456",25000.00f,"12E","AIR INDIA",null,null,
                "CHENNAI","MALDIVES","DepartureDateAndTime",
                "ArrivalDateAndTime",false,"maldives beach no 123",new String[]{"beach","ocean park","chocolate factory"});

        /*
        System.out.println(regularTicket.getFlightName());
        touristTicket.getTouristLocations();
        System.out.println(regularTicket.getPnr());
        System.out.println(touristTicket.getPnr());
        System.out.println(regularTicket.flightDuration());
        System.out.println(Arrays.toString(touristTicket.getSelectedTourLocations()));
        touristTicket.addTourlistLocations( "beach123");
        touristTicket.addTourlistLocations("ocean park123");                                //  Demo printing values
        System.out.println(Arrays.toString(touristTicket.getSelectedTourLocations()));
        touristTicket.removeTouristLocations("beach");
        System.out.println(Arrays.toString(touristTicket.getSelectedTourLocations()));
        touristTicket.removeTouristLocations("beach123");
        System.out.println(Arrays.toString(touristTicket.getSelectedTourLocations()));
        System.out.println(passenger2.getId());
 */

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());                    //Method to print pnr of both type of tickets

    }


}