package com.company;

public class TouristTicket extends Ticket {
     private String hotelAddress;
     private String[] selectedTourLocations;

     public TouristTicket(String pnr, float price, String seatNumber, String flightName, Flight flight, Passenger passenger,
                          String departureLocation, String arrivalLocation, String departureDateAndTime,
                          String arrivalDateAndTime, boolean cancelled , String hotelAddress ,String[] selectedTourLocations) {
          super(pnr, price, seatNumber, flightName, flight, passenger, departureLocation, arrivalLocation, departureDateAndTime,
                  arrivalDateAndTime, cancelled);
          this.hotelAddress = hotelAddress;
          this.selectedTourLocations = selectedTourLocations;
     }


     public String getHotelAddress() {
          return hotelAddress;
     }

     public void setHotelAddress(String hotelAddress) {
          this.hotelAddress = hotelAddress;
     }

     public String[] getSelectedTourLocations() {
          return selectedTourLocations;
     }

     public void setSelectedTourLocations(String[] selectedTourLocations) {
          this.selectedTourLocations = selectedTourLocations;
     }

    /* public String getTouristLocations() {
          String getTour[] = new String[5];
          getTour[1] = "resort1";
          getTour[2] = "resort2";
          getTour[3] = "resort3";
          getTour[4] = "resort4";
          getTour[5] = "resort5";
          System.out.println("tourist locations :");
          for (int i = 1; i <= 5; i++) {
               System.out.print(getTour[i]);
          }
          return null;
     } */

     public void removeTouristLocations(String location) {
          int index = -1;
          for (int i = 0; i < selectedTourLocations.length; i++) {
               if (selectedTourLocations[i].equals(location)) {
                    index = i;
                    break;
               }
          }
          if (index == -1) {
               return;
          }

          for (int i = index; i < selectedTourLocations.length - 1; i++) {
               selectedTourLocations[i] = selectedTourLocations[i + 1];
          }
          selectedTourLocations[selectedTourLocations.length - 1] = null;

     }
          public void addTourlistLocations (String location){
          int index = -1;
          for(int i=0;i< selectedTourLocations.length;i++){
               if(selectedTourLocations[i] == null){
                    index = i;
                    break;
               }
          }
          if (index != -1) {
               selectedTourLocations[index] = location;
          }

          }
     }

