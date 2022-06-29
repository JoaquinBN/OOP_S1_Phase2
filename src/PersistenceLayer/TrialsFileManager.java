package PersistenceLayer;

import BusinessLayer.Trials.Trials;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TrialsFileManager {
    public TrialsFileManager() {
    }

    public void writeTrials(ArrayList<Trials> trials) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter("Files/Trials.csv", true),
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.NO_ESCAPE_CHARACTER, "\n");


    }
}
