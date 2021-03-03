package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        RegularTicket regularTicket = new RegularTicket("1512553D", 1500.00f,"24D" ,"SPICE JET",null,
                null, "DELHI","VIZAG" ,"2/3/2021 10:30:30",
                "2/3/2021 12:30:30", false , "Fried Rice");

        TouristTicket touristTicket = new TouristTicket("1512A1",25000.00f,"12E","AIR INDIA",null,null,
                "CHENNAI","MALDIVES","DepartureDateAndTime",
                "ArrivalDateAndTime",false,"maldives beach no 123",new String[]{"beach","ocean park","chocolate factory"});

        System.out.println(regularTicket.getFlightName());
        System.out.println(regularTicket.getPnr());
        System.out.println(touristTicket.getPnr());
        System.out.println(regularTicket.flightDuration());
        System.out.println(Arrays.toString(touristTicket.getSelectedTourLocations()));
    }

}