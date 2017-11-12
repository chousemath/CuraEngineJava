import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Parser {
    public PrinterDefinition printerDefinition;
    public Overrides overrides;

    public Parser(String filePath) {
        Gson gson = new Gson();
        try {
            Reader reader = new FileReader(filePath);
            this.printerDefinition = gson.fromJson(reader, PrinterDefinition.class);
            this.overrides = new Overrides(printerDefinition.overrides);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
