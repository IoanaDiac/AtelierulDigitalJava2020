package lab3.Challenge2Strategy;

public class BubbleSort implements SortingStrategy{
    public void sort(Integer[] list){
        int aux;
        for(int i=0; i< list.length-1; i++)
            for(int j=1; j<list.length-i-1;j++){
                if(list[j] > list[j+1]){
                    aux = list[j];
                    list[j] = list[j+1];
                    list[j+1] = aux;
                }
            }
    }
}
