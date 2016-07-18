package company;

/**
 * Created by AlexZ on 26.06.2016.
 */
public class Contact {
    String name;
    String surename;
    HomePhone homePhone;
    MobilePhone mobilePhone;

    public Contact(String name, String surename){
        this.name = name;
        this.surename = surename;
    }
    public Contact(){}

    public void setHomePhone(HomePhone homePhone){this.homePhone = homePhone;}

    public void setMobilePhone(MobilePhone mobilePhone){this.mobilePhone = mobilePhone;}

    public void printAllInformation(){
        StringBuffer str = new StringBuffer();
        str.append(name);
        str.append(" ");
        str.append(surename);
        str.append(" ");
        str.append(homePhone.getPhone());
        str.append(" ");
        str.append(mobilePhone.getPhone());
        System.out.println(str.toString());
    }
}
