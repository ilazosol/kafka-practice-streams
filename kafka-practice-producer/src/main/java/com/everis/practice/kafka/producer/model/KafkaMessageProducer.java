package com.everis.practice.kafka.producer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import reactor.core.publisher.FluxSink;

@Component
public class KafkaMessageProducer {

    //@Value(value = "${message.topic.name}")
    //private String topicName;

    @Autowired
    private FluxSink<String> sink;

    /*public void sendMessage(String message) {
        System.out.println(message);
        System.out.println(topicName);
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicName, message);
        future.addCallback(new ListenableFutureCallback<>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                System.out.println("Sent message=[" + message + "] with offset=[" + result.getRecordMetadata().offset() + "]");
            }
            @Override
            public void onFailure(Throwable ex) {System.err.println("Unable to send message=[" + message + "] due to : " + ex.getMessage());
            }
        });
    }*/

    public String sendMessage2(String body) {
        this.sink.next(body);
        System.out.println("Entro al metodo sendessage2");
        return "Mensaje enviado";
    }
}
