package ru.geekbrains.lesson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [] words = {
                "Shirt", "Car", "Car", "Plane", "Human", "Human",
                "Shirt", "Plane", "Plane", "Child", "Plane",
                "Human", "Java", "Shirt", "Car", "Child", "Human"
        };

        findAndCountUniqueWords(words);

        TelephoneBook tb = new TelephoneBook();
        tb.addRecord(12345, "Vlad");
        tb.addRecord(16343, "Bart");
        tb.addRecord(53421, "Johnny");
        tb.addRecord(66111, "Gunter");
        tb.addRecord(11223, "Bart");

        tb.getRecord("Bart");

    }

    private static void findAndCountUniqueWords (String[] arr){
        Set<String> lhs = new LinkedHashSet<>(Arrays.asList(arr));
        for (String s : lhs){
            System.out.println(s + " " + Collections.frequency(Arrays.asList(arr), s));
        }
    }
}

