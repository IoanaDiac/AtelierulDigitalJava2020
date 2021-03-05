package lab4.Ch2;

import lab4.Ch1.PhoneBook;
import lab4.exception.Calculator;

public class Main {
    public static void main(String[] args) {
        SecretMessage secretMessage = new SecretMessage("./src/lab4/lab9.lab8.ch2/input.txt");
        System.out.println(secretMessage.getSecretMessage());
    }
}
