package lab3.Challenge1;

public class ArrayCustomIterator implements Iterator{
    private int[] arr;
    private int position=0;
    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }
    public boolean hasNext(){
        if (position >= arr.length)
            return false;
        else return true;
    }

    public int next(){
        return arr[position++];
    }
}
