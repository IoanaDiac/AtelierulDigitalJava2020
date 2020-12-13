package lab4.Ch3;

import lab4.Ch2.SecretMessage;

public class Main {
    public static void main(String[] args) {
        Anagram anagram = new Anagram("./src/lab4/Ch3/input.txt","listen");
        anagram.displayAnagram();
    }



}
