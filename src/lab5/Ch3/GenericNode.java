package lab5.Ch3;

public class GenericNode<T> implements IGenericNode<T> {
    private T value;
    private IGenericNode<T> next=null;



    @Override
    public T getValue() {
        return this.value;
    }

    @Override
    public void setValue(T value) {
        this.value=value;
    }

    @Override
    public IGenericNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.next = next;
    }
}
