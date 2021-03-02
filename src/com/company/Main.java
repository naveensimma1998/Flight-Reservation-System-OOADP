package com.company;

public class Main {

    public static void main(String[] args) {


        RegularTicket regularTicket = new RegularTicket("1512553D", 1500.00f,"24D" ,"SPICE JET",null,
                null, "DELHI","VIZAG" ,"DepartureDateAndTime",
                "ArrivalDateAndTime", false , "Fried Rice");

        TouristTicket touristTicket = new TouristTicket("1512A1",25000.00f,"12E","AIR INDIA",null,null,
                "CHENNAI","MALDIVES","DepartureDateAndTime",
                "ArrivalDateAndTime",false,"maldives beach no 123",new String[]{"beach","ocean park"});

        System.out.println(regularTicket.getFlightName());
        System.out.println(regularTicket.getPnr());
        System.out.println(touristTicket.getPnr());

    }

}