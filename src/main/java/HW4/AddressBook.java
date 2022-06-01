package HW4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Александр Ключка
 * @date 6/1/2022
 */


public class AddressBook {
    private Map<Integer, String> phonebook;
 {
        phonebook = new HashMap<>();
    }
    public void add(int number, String surname) {
        phonebook.put(number, surname);
    }
    public void get(String surname){
        if(phonebook.containsValue(surname)) {
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if(temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("Such a name is not on the list.");
        }
    }
}