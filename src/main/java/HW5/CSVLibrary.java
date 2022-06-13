package HW5;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

//        //1. Реализовать сохранение данных в csv файл;
//        //2. Реализовать загрузку данных из csv файла. Файл читается целиком.
//        //Структура csv файла:
//        //Value 1;Value 2;Value 3
//        //100;200;123
//        //300,400,500
//        // Строка Unicode

public class CSVLibrary {
    public static void main(String args[]) {
        CSVLibrary csvLibrary = new CSVLibrary();
        csvLibrary.writeToCsv();
        //  csvLibrary.readCSVFile();
    }

    public void writeToCsv() {
        String csv = "data1.csv";
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(csv));
            String record = "Value 1;Value 2;Value 3\n" +
                    "100;200;123\n" +
                    Arrays.toString("300,400,500".split(","));
            writer.writeNext(new String[]{record});

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readCSVFile() {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("data.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String[]> allRows = null;
        try {
            allRows = reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            e.printStackTrace();
        }

        for (String[] row : allRows) {
            System.out.println(Arrays.toString(row));
        }
    }
}
