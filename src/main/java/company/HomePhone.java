package company;

/**
 * Created by AlexZ on 26.06.2016.
 */
public class HomePhone extends Phone {
    private String city;

    public HomePhone(String city, String phone){
        this.city = city;
        number = phone;
    }

    public HomePhone(){}

    public String getPhone() {
        StringBuffer str = new StringBuffer();
        str.append(city);
        str.append(" ");
        str.append(number);
        return str.toString();
    }
}
