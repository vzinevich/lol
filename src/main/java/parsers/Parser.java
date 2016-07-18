package parsers;

import company.Information;

import java.io.IOException;

/**
 * Created by Vitaly on 6/26/2016.
 */
public interface Parser {

    void write(Information information, String path) throws IOException;

    Information read(String path) throws IOException;
}
