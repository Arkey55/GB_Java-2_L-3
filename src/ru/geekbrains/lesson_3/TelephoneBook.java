package ru.geekbrains.lesson_3;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    private Map<Integer, String> phoneBook = new HashMap<>();

    public void addRecord(int phoneNumber, String name){
        phoneBook.put(phoneNumber, name);
    }

    public void getRecord(String name){
        for (Map.Entry entry : phoneBook.entrySet()){
            if (entry.getValue().equals(name)){
                System.out.println(String.format("number: %s, name: %s ", entry.getKey(), entry.getValue()));
            }
        }
    }
}
