package observer.email_topic_context.models;

import java.util.ArrayList;
import java.util.List;

import observer.email_topic_context.interfaces.Observer;
import observer.email_topic_context.interfaces.Subject;

public class EmailTopic implements Subject {
    private final List<Observer> observers;
    private String message;

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    public void postMessage(String msg) {
        System.out.println("Message received");
        this.message = msg;
        notifyObservers();
        ;
    }

    @Override
    public void register(Observer observer) {
            if(observer == null) 
                throw new NullPointerException("Observer Null");

            if(!this.observers.contains(observer))
                this.observers.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        int indexToDelete = this.observers.indexOf(observer);

        this.observers.remove(indexToDelete);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : this.observers){
            o.update();
        }
    }

    @Override
    public Object getUpdate(final Observer observer) {

        return this.message;

    }
    
}