package HW5;

import java.util.Arrays;

//1. Реализовать сохранение данных в csv файл;
     //2. Реализовать загрузку данных из csv файла. Файл читается целиком.
     //Структура csv файла:
     //Value 1;Value 2;Value 3
     //100;200;123
     //300,400,500
     // Строка Unicode

public class DZ5 {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("example.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_example1.csv");
    }
}
