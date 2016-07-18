import company.Contact;
import company.HomePhone;
import company.Information;
import company.MobilePhone;
import parsers.JsonParser;
import parsers.XmlParser;

import java.io.IOException;

/**
 * Created by AlexZ on 26.06.2016.
 */
public class Main {
    public static final String XML_PATH = "C:\\temp\\lections\\xmlJsonMine\\xmlFile.xml";
    public static final String JSON_PATH = "C:\\temp\\lections\\xmlJsonMine\\jsonFile.json";

    public static void main(String[] args) throws IOException {
        Contact vasya = new Contact("vasya", "pupkin");
        vasya.setHomePhone(new HomePhone("Minsk", "+375172316580"));
        vasya.setMobilePhone(new MobilePhone("375298388810", "velcom"));
        Contact eugen = new Contact("eugen", "uk");
        eugen.setHomePhone(new HomePhone("minsk", "+37529"));
        eugen.setMobilePhone(new MobilePhone("mts", "+375292316"));
        vasya.printAllInformation();

        Information information = new Information("work Group");

        information.addContact(vasya);
        information.addContact(eugen);
        information.printInfo();

        XmlParser xmlParser = new XmlParser();
        JsonParser jsonParser = new JsonParser();
        System.out.println("After parsing:\nXML:");
        xmlParser.write(information, XML_PATH);
        xmlParser.read(XML_PATH).printInfo();
        System.out.println("After parsing:\nJSON:");
        jsonParser.write(information, JSON_PATH);
        jsonParser.read(JSON_PATH).printInfo();
    }
}