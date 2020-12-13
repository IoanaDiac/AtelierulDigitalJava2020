package lab4.Ch3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    private String[] words=new String[0];
    private String anagramWord;

    public Anagram(String text, String anagramWord){
        try{
            String word;
            int count=0;
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
        this.anagramWord=anagramWord;
    }

    private String sortLetters(String word){
        char tempArray[] = word.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public void displayAnagram(){
        String sortedWord=sortLetters(anagramWord);
        for(String word:words){
            String sort=sortLetters(word);
            if(sort.equals(sortedWord)){
                System.out.println(word);
            }
        }
        sortLetters(anagramWord);


    }
}


