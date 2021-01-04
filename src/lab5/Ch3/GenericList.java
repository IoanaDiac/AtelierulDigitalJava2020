package lab5.Ch3;

public class GenericList<T> implements IGenericList<T> {
    private IGenericNode<T> first;
    private IGenericNode<T> currentNode;

    public GenericList(T firstValue) {
        this.first = new GenericNode<>();
        first.setValue(firstValue);
        currentNode=this.first;
    }

    @Override
    public void insert(T element) {

        IGenericNode<T> nextNode= new GenericNode<>();

        nextNode.setValue(element);
        currentNode.setNext(nextNode);
        currentNode= currentNode.getNext();
    }

    @Override
    public void println() {
        IGenericNode<T> currentNode = this.first;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            System.out.println(currentNode.getValue());
        }
    }
}

