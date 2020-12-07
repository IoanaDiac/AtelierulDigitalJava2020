package lab3.Challenge4Observer;



public interface ObservedSubject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers(String message);

}