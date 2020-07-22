package observer.email_topic_context.models;

import observer.email_topic_context.interfaces.Observer;
import observer.email_topic_context.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
    private String message;
    private Subject topic;

    public EmailTopicSubscriber(String info){
        this.message = info;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);

        if(msg == null)
            System.out.println(this.message + " No message on this topic ");
        else
            System.out.println(this.message + " Retrieving message " + msg);

    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



  
    
}