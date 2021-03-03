package com.company;

public class Passenger {
    private  static  int idCounter =0;
    private  int id;
    private static class Address{
        String street,city,state;
          Address(String street,String city ,String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    private  static  class Contact {
        String name, email, phone;

        Contact(String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
        }
    }
    private  Contact contact;

    public Passenger(String street,String city, String state , String name,String email,String phone){
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, email, phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getAddressDetails(){
        return "street : " + address.street + " city : " + address.city + " sate : " + address.state;
    }

    public String getContactDetails(){
        return "name : " + contact.name + " email : " + contact.email + " phone : " + contact.phone;
    }
    public void updateAddressDetails(String street,String city, String state){
         address.street = street;
         address.city = city;
         address.state = state;
    }
    public void updateContactDetails(String name,String email, String phone){
        contact.name = name;
        contact.email = email;
        contact.phone = phone;
    }

}
