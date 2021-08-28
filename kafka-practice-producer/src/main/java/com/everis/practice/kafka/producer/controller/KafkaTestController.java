package com.everis.practice.kafka.producer.controller;

import com.everis.practice.kafka.producer.model.KafkaMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaTestController {

    @Autowired
    KafkaMessageProducer kafkaMessageProducer;

    @PostMapping("/add")
    public void addIdCustomer(@RequestBody String body){
        //kafkaMessageProducer.sendMessage(body);
    }

    @PostMapping("/send")
    public String createOrder(@RequestBody String body){
        return kafkaMessageProducer.sendMessage2(body);
    }
}
