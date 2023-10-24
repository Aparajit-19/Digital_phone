package com.company;
import java.util.ArrayList; //-Later part

public class MobilePhone{
    private String myNumber;
    private ArrayList <Contact> myContacts; //-For better understanding refer - Java mas. > Java mas. 2 > Concepts > Arraylist challenge.

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList <Contact>(); //-Likewise array.
    }

    public boolean addNewContact(Contact contact){  //-Contact contact: Object declaration.
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() +", was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; i < this.myContacts.size(); i++){ //-Refer at the end.
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){ //-Contact contact: Object declaration.
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){ //-Rem
        System.out.println("Contact List");
        for(int i=0; i < this.myContacts.size(); i++){
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " + //-Rem
                    this.myContacts.get(i).getPhoneNumber()); //-Rem
        }
    }

}
//NOTE:
//-array.length: length is a final variable applicable for arrays. With the help of the length variable, we can obtain the size of the array.
//-string.length(): length() method is a final variable which is applicable for string objects. The length() method returns the number of
// characters present in the string.
//-arraylist.size(): The size of an arraylist can be obtained by using the arraylist.size() method as it returns the number of elements in the
// arrayList i.e. the size.







