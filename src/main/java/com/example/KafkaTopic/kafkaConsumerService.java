package com.example.KafkaTopic;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class kafkaConsumerService {


    private static final String TOPIC = "my-topic";
    private static final CopyOnWriteArrayList<String> receivedMessages = new CopyOnWriteArrayList<>();


    @KafkaListener(topics = TOPIC, groupId = "my-group")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
        receivedMessages.add(message);

    }
    public static CopyOnWriteArrayList<String> getReceivedMessages() {
        return receivedMessages;
    }
}

