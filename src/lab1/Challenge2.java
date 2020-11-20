package lab1;

import java.util.Scanner;

public class Challenge2 {

    public static String compute(int num) {
        String s="";
        boolean replaced=false;
        if(num%3 ==0 ){
            s += "Foo";
            replaced = true;
        }
        if(num%5 ==0 ){
            s += "Bar";
            replaced = true;;
            }
        if(num%7 ==0 ){
            s += "Qix";
            replaced = true;;
        }

        char[] sirCifre = String.valueOf(num).toCharArray();
        for (char cifra : sirCifre) {
            if(cifra == '3'){
                s += "Foo";
                replaced = true;
            }
            if(cifra == '5'){
                s += "Bar";
                replaced = true;;
            }
            if(cifra == '7'){
                s += "Qix";
                replaced = true;;
            }
        }
        if(!replaced) s+= String.valueOf(num);
        return(s);
    }

    public static String compute2(int i) {
        String s = "";

        boolean replaced=false;
        if (i % 3 == 0) {
            s += "Foo";
            replaced = true;
        }
        if (i % 5 == 0) {
            s += "Bar";
            replaced = true;
        }
        if (i % 7 == 0) {
            s += "Qix";
            replaced = true;
        }

        char[] sirCifre = String.valueOf(i).toCharArray();
        for (char cifra : sirCifre) {

            if (cifra == '3') s += "Foo";
            else if (cifra == '5') s += "Bar";
            else if (cifra == '7') s += "Qix";
            else if (cifra == '0') s += "*";
            else if (!replaced) s += cifra;
        }

        return s;
    }

    public static void main(String[] args){
        System.out.println("Challenge 2- Stage 1 ");
        Scanner in = new Scanner(System.in);
        System.out.print("Limita pentru primul sir: ");
        int n1 = in.nextInt();

        for(int i=1; i<=n1; i++)
            System.out.print(compute(i)+", ");
        System.out.print("\n");

        System.out.println("Challenge 2- Stage 2 ");
        System.out.print("Limita pentru al doilea sir: ");
        int n2 = in.nextInt();
        for(int i=1; i<=n2; i++)
            System.out.print(compute2(i)+", ");
    }
}
