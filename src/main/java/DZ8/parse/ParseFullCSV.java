package DZ8.parse;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class ParseFullCSV {
    public static void main(String[] args) throws Exception
    {
        CSVReader reader = new CSVReader(new FileReader("data.csv"), ',', '"'
                ,0);
        List<String[]> allRows = reader.readAll();
        for(String[] row : allRows){
            System.out.println(Arrays.toString(row));
        }
    }
}
