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

    public void getTouristLocations() {
          String getTour[] = new String[5];
          getTour[0] = "beach";
          getTour[1] = "ocean park";                        //just showing details of tourist locations
          getTour[2] = "chocolate factory";
          getTour[3] = "beach123";
          getTour[4] = "ocean park123";
          System.out.println("tourist locations :");
          for (int i = 0; i < 5; i++) {
               System.out.print(getTour[i] );
          }
          System.out.println();
     }

     public void removeTouristLocations(String removeLocation) {
          int currrentLength = selectedTourLocations.length;
          int afterRemoveLength = currrentLength -1;
          String tempArray[] = new String[afterRemoveLength];   // removing the tour locations
          for(int i=0 ,k = 0;i<currrentLength;i++){
               if( selectedTourLocations[i].equals(removeLocation)) {
                continue;
               }
               tempArray[k++] = selectedTourLocations[i];
          }
         selectedTourLocations = tempArray;
     }
          public void addTourlistLocations (String addTour){
          int currrentLength = selectedTourLocations.length;
          int newLength = currrentLength +1;
          String tempArray[] = new String[newLength];
          for(int i=0;i<currrentLength;i++){
               tempArray[i] = selectedTourLocations[i];                    // add tour locations
          }
          tempArray[newLength - 1] = addTour;
          selectedTourLocations = tempArray;
          }
     }

