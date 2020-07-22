package observer.email_topic_context;

import observer.email_topic_context.interfaces.Observer;
import observer.email_topic_context.models.EmailTopic;
import observer.email_topic_context.models.EmailTopicSubscriber;

public class Run {

    public static void main(String[] args) {
        
        EmailTopic topic = new EmailTopic();

        // create observers

        Observer first = new EmailTopicSubscriber("First Observer");
        Observer second = new EmailTopicSubscriber("second Observer");
        Observer third = new EmailTopicSubscriber("third Observer");

        // register them

        topic.register(first);
        topic.register(second);
        topic.register(third);

        // attaching observer to subject

        first.setSubject(topic);
        second.setSubject(topic);
        third.setSubject(topic);

        // check for update

        first.update();

        // broadcaster

        topic.postMessage("Hello Novinho quer TC");

        
    }
    
}