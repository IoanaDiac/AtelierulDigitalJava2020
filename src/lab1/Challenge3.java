package lab1;

import java.util.Scanner;

public class Challenge3 {
    public static Scanner in=new Scanner(System.in);

    public static int[] getInteger(int n){
        System.out.println("Introduceti "+n+ " numere intregi: ");
        int[] val=new int[n];
        for(int i=0; i<n;i++)
            val[i] = in.nextInt();
        return val;
    }
    public static int pairs(int[] vec){
        int pairs=0;
        for(int i=0; i<vec.length -1; i++){
            for(int j=i+1; j<vec.length ; j++){
                if(vec[i]+vec[j]==0){
                    pairs++;
                    int aux=vec[i+1];
                    vec[i+1]=vec[j];
                    vec[j]=aux;
                    i++;
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

        System.out.println("Numarul de perechi: "+pairs(vec));
    }
}
