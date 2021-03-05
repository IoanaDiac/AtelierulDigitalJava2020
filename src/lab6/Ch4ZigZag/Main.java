package lab6.Ch4ZigZag;

import java.util.*;

public class Main {
    public static List<Integer> ZigZag(List<Integer> list ){
        boolean higher=true;
        Integer aux;
        for(int i =0; i< list.size()-1; i++){

            if(higher)
                if(list.get(i)<list.get(i+1)){
                    aux=list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, aux);}
            else
                if(list.get(i)>list.get(i+1)){
                    aux=list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, aux);}
            higher=!higher;
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(ZigZag(Arrays.asList(4,3,2,1,4,6,3,5)));
    }
}
