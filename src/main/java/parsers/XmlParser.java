package parsers;
import com.thoughtworks.xstream.XStream;
import company.Contact;
import company.Information;

import java.io.*;

/**
 * Created by Vitaly on 6/26/2016.
 */
public class XmlParser implements Parser {
    @Override
    public void write(Information information, String path) throws IOException {
        XStream xStream = getXStreamObject();

        String xml = xStream.toXML(information);

        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(xml);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(xml);

        bufferedWriter.close();
        fileWriter.close();
    }

    @Override
    public Information read(String path) throws IOException {
        StringBuffer xmlString = new StringBuffer();
        XStream xStream = getXStreamObject();

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (true){
            String line = bufferedReader.readLine();
            if (line == null) break;
            xmlString.append(line);
        }
        return (Information) xStream.fromXML(xmlString.toString());
    }

    private XStream getXStreamObject(){
        XStream xStream = new XStream();
        xStream.alias("Information", Information.class);
        xStream.alias("contact", Contact.class);
        xStream.useAttributeFor(Information.class, "information");
        return xStream;
    }
}
