package lab1;

import java.util.Scanner;

public class Challenge4 {
    public static Scanner in=new Scanner(System.in);

    public static int[] getInteger(int n){
        System.out.println("Introduceti "+n+ " numere intregi: ");
        int[] val=new int[n];
        for(int i=0; i<n;i++)
            val[i] = in.nextInt();
        return val;
    }
    public static int pairs3(int[] vec){
        int pairs=0;
        int r=0; //numara elementele in index[]
        int[] index=new int[vec.length]; // vectorul imi retine indexul numerelor care sunt deja in perechi
        for(int i=0; i<vec.length -2; i++){
            for(int j=i+1; j<vec.length -1; j++){
                for(int k=j+1;k<vec.length ; k++){
                    if (vec[i] + vec[j]+ vec[k]== 0) {
                        boolean find=false;
                        for(int m=0; m<=0 ; m++){
                            if (index[m] == i || index[m] == j || index[m] == k)
                                find=true;
                        }
                        if(!find){
                            pairs++;
                            index[r] =i;
                            index[r+1]=j;
                            index[r+2]=k;
                            r+=3;
                        }
                    }
                    }
                }
            }
        return(pairs);
        }

    public static void main(String[] args){
        System.out.println("Challenge 3");

        System.out.println("Cate numere in vector? ");
        int n= in.nextInt();
        int[] vec=getInteger(n);

        System.out.println("Numarul de perechi de 3: "+pairs3(vec));
}}
