package parsers;

import com.google.gson.Gson;
import company.Information;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Vitaly on 6/26/2016.
 */
public class JsonParser implements Parser {
    @Override
    public void write(Information information, String path) throws IOException {
        Gson gson = new Gson();

        String json = gson.toJson(information);

        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(json);
        fileWriter.close();
    }

    @Override
    public Information read(String path) throws IOException {
        Gson gson = new Gson();

        BufferedReader reader = new BufferedReader(new FileReader(path));

        Information information = gson.fromJson(reader, Information.class);
        return information;
    }
}
