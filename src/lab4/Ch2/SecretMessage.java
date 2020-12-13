package lab4.Ch2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class SecretMessage {
    private String[] words=new String[0];
    private int count=0;

    public SecretMessage(String text){
        try{
            String word;
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(text)));
            while (scanner.hasNext()){
                word = scanner.next();
                words = Arrays.copyOf(words, words.length + 1);
                words[count]=word;
                count++;
            }
        }catch(Exception e){
            System.out.println("not found");
        }
    }

    public String getSecretMessage(){
        String secretMess="";
        for(String word:words){
            char[] letters =word.toCharArray();
            for( char letter :letters){
                if (Character.isUpperCase(letter)) {
                    if (letter == 'X') {
                        secretMess += " ";
                    } else {
                        secretMess += letter;
                    }
                }
            }
        }
        return secretMess;
    }
    }


