package com.everis.practice.kafka.producer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.FluxSink;

@Configuration
public class ProducerConfig {

    @Bean
    public DirectProcessor<String> publisher(){
        return DirectProcessor.create();
    }

    @Bean
    public FluxSink<String> sink(DirectProcessor<String> publisher){
        return publisher.sink();
    }
}
