package com.company;

public class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    //-For better understanding of line 20-21 refer - Java mas. > Java mas. 2 > Concepts > Method overloading vs overriding.
    }

}
