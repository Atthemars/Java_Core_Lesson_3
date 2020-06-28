package geekbrains.homework;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String cell) {
        ArrayList<String> listOfNumbers = phoneBook.get(name);
        if (listOfNumbers == null) listOfNumbers = new ArrayList<>();
        listOfNumbers.add(cell);
        phoneBook.put(name, listOfNumbers);
    }
    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }
    public void info (){
        System.out.println(phoneBook);
    }

}
