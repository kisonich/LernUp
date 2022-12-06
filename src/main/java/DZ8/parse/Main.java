package DZ8.parse;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

import java.io.FileReader;
import java.util.List;

public class Main {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws Exception {
        CsvToBean csv = new CsvToBean();
        String csvFilename = "data.csv";
        CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
        List list = csv.parse(setColumnMapping(), csvReader);
        for (Object object : list) {
            Person person = (Person) object;
            System.out.println(person);
        }
    }
    @SuppressWarnings({"rawtypes", "unchecked"})
    private static ColumnPositionMappingStrategy setColumnMapping() {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Person.class);
        String[] columns = new String[] {"firstName", "lastName", "age", "numPhone"};
        strategy.setColumnMapping(columns);
        return strategy;
    }
}
