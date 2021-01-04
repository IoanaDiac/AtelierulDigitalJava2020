package lab5.Ch5;

public class BinarySearch <T extends Comparable>{
    private T[] arr;

    public BinarySearch(T[] arr){
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }
}
