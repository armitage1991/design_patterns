package observer.email_topic_context.interfaces;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
    Object getUpdate(Observer observer);
    
}