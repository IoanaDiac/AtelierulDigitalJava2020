package lab4.Ch5;

import lab4.Ch2.SecretMessage;

import java.util.*;

public class Main {
    private static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {

        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        Occurrence occurrence = new Occurrence("./src/lab4/ch5/input.txt");
        System.out.println(occurrence.toString());
        HashMap<String, Integer> sortedOccurrence = sortByValue(occurrence.getWordOccurrence());

        for (Map.Entry<String, Integer> en : sortedOccurrence.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

    }
}