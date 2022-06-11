package HW4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Александр Ключка
 * @date 6/1/2022
 */


public class AddressBook {
    private Map<String, Integer> phonebook = new HashMap<>();

    public void addElementPhoneBook(String surname, int number ) {
        phonebook.put(surname, number);
    }
    public void get(Integer number){
        if(phonebook.containsValue(number)) {
            Set<Map.Entry<String, Integer>> set = phonebook.entrySet();
            for (Map.Entry<String, Integer> temp : set) {
                if(temp.getValue().equals(number)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("Such a name is not on the list.");
        }
    }
}