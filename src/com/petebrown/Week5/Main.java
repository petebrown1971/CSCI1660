package com.petebrown.Week5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


class Person {
    protected String name;
    public String email;

    public Person(String name, String email){
        this.name = name;
        this.email = email;

    }
}

class AddressBook {
    private Map<String, Person> _addresses = new TreeMap<>();

    public void add(Person p) {
        _addresses.put(p.name, p);

    }

    public void remove(Person p) {
        _addresses.remove(p.name, p);

    }

    public Person searchBook(String name) {
        if (_addresses.containsKey(name)) {
            return _addresses.get(name);
        } else {
            return null;
        }
    }

    public void displayBook() {
        for (String name: _addresses.keySet()){
            System.out.println(name + " " +_addresses.get(name).email);
        }

    }
}

public class Main {
    public static void main(String[] args) {
            AddressBook book = new AddressBook();
            Person bob = new Person("Bob", "bob@microsoft.com");
            book.add(bob);
            book.add(new Person("Ron", "ron@hogwarts.com"));
            book.displayBook();

            Scanner in = new Scanner(System.in);
            System.out.println("Enter name to remove");
            String name = in.next();
            book.searchBook(name);
            book.remove(bob);
            book.displayBook();


        }


    }
