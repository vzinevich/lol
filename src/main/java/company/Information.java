package company;

import java.util.HashSet;

/**
 * Created by Vitaly on 6/26/2016.
 */
public class Information {
    private HashSet<Contact> contacts;
    private String information;

    public Information(String information){
        this.contacts = new HashSet<>();
        this.information = information;
    }

    public Information(){}

    public HashSet<Contact> addContact(Contact contact){
        this.contacts.add(contact);
        return this.contacts;
    }

    public void printInfo(){
        System.out.println(information);
        for(Contact c : contacts){
            c.printAllInformation();
        }
    }
}
