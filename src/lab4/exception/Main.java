package lab4.exception;

import lab4.Ch1.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/lab4/io/input.txt");
        System.out.println(phoneBook);
        System.out.println("Abber: " + phoneBook.getByName("Abbey"));
        System.out.println("Abdul: "+phoneBook.getByName("Abdul"));

    }
}