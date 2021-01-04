package lab5.Ch4;

public class ArrayIterator<T> implements IArrayIterator<T>{
    private T[] array;
    private int index=0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index< array.length;
    }

    @Override
    public T next() {
        return array[index++];
    }
}
