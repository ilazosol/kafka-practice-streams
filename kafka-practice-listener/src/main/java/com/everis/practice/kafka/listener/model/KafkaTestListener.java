package com.everis.practice.kafka.listener.model;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTestListener {
    //@KafkaListener(topics = "${message.topic.name}", groupId = "${message.group.name}")
    public void listenTopic(String message) {
        System.out.println("Recieved Message of topic in listener: " + message);
    }
}
