package lab5.Ch2;

public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T firstElement, T secondElement) throws ShoesNotMatch {
        if(!match(firstElement,secondElement)){
            throw new ShoesNotMatch();
        }
        first = firstElement;
        second = secondElement;
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }

    private boolean match(T s1, T s2){
        if(!s1.getColor().equals((s2.getColor())))
                return false;
        if(!s2.getSize().equals(s2.getColor()))
                return false;
        return true;
    }


}
