package HW4;

import java.util.*;

/**
 * @author Александр Ключка
 * @date 6/1/2022
 */


public class Main {
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
// из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Саня", "Ваня", "Ваня", "Сережа", "Маша", "Паша",
                "Вася", "Микола", "Петя", "Саня", "Саня", "Чмоня", "Ибрагим", "Магомед");

        System.out.println("сколько раз встречается каждое слово:");

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : names) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

        System.out.println("\nсписок уникальных слов: ");
        Set<String> unique = new HashSet<>(names);
        unique.forEach(System.out::println);

//2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        System.out.println("\n часть два ");
        AddressBook addressable = new AddressBook();
        addressable.addElementPhoneBook("Ivanov", 898398918);
        addressable.addElementPhoneBook("Petrov", 89198111);
        addressable.addElementPhoneBook("Shum", 1118111);
        addressable.addElementPhoneBook("Sidorov", 1198111);
        addressable.addElementPhoneBook("Shuqrem", 808080980);
        addressable.addElementPhoneBook("Shuqqrrm", 7676767);

        addressable.get(898398918);


    }
}



