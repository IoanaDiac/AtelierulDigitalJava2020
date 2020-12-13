package lab4.Ch5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Occurrence {
    HashMap<String, Integer> wordOccurrence = new HashMap<>();

    public Occurrence(String text){
        try {
            String word;
            Integer occurrence;
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(text)));
            while (scanner.hasNext()){
                word = scanner.next().toLowerCase();
                if( wordOccurrence.containsKey(word)){
                    wordOccurrence.put(word,wordOccurrence.get(word)+1 );
                }else {
                    wordOccurrence.put(word,1);
                }
            }
        }catch(Exception e){
            System.out.println("not found");
        }
    }

    public HashMap<String, Integer> getWordOccurrence() {
        return wordOccurrence;
    }

    public String toString(){
        return wordOccurrence.toString();
    }
}
