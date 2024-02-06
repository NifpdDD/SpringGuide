package myapp.сonfig;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "mytopic", groupId = "group_id")
    public void handleMessage(String message) {
        System.out.println("Received message: " + message);
    }

}
