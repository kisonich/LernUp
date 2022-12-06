package DZ8.parse;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileWriter;

public class WritingCSVFile {
    public static void main(String[] args) throws Exception
    {
        String csv = "data.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] record = "Владимир,Путин,51 ,**********".split(",");
        writer.writeNext(record);
        System.out.println(record.length);
        writer.close();
    }
}
