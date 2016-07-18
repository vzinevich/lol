package company;

/**
 * Created by AlexZ on 26.06.2016.
 */
public class MobilePhone extends Phone {

    private String operator;

    public MobilePhone(String phone, String operator){
        number = phone;
        this.operator = operator;
    }

    public MobilePhone(){}

    public String getPhone() {
        StringBuffer str = new StringBuffer();
        str.append(operator);
        str.append(" ");
        str.append(number);
        return str.toString();
    }
}
