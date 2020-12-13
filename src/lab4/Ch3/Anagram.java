package lab4.Ch3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    private String[] words=new String[0];
    private String[] permutations=new String[0];
    private int count=0;
    private int countp=0;
    private String anagramWord;


    public Anagram(String text, String anagramWord){
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
        this.anagramWord=anagramWord;
    }

    private void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            permutations = Arrays.copyOf(permutations, permutations.length + 1);
            permutations[countp]=ans;
            countp++;
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);


            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            printPermutn(ros, ans + ch);
        }
    }

    public void displayAnagram(){

        printPermutn(anagramWord,"");

        for(String permutation:permutations){
            for(String word:words){
                if(permutation.equals(word)){
                    System.out.println(word);
                }
            }
        }

        }
    }


