package lab3.Challenge4Observer;

import java.util.ArrayList;

public class Teacher implements ObservedSubject{
    private ArrayList<Observer> observers;
    private String message;

    @Override
    public void register(Observer obj) {
        this.observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        for(Observer observer:observers){
            int index = observers.indexOf(obj);
            System.out.println("Removed student " + obj);
            this.observers.remove(index);
        }
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer:observers){
            observer.update(message);
        }
    }

    public void teach(String topic){
        /*for(Observer observer:observers){
            observer.update(topic);
        }*/
        notifyObservers(topic);

    }
}
