package com.everis.practice.kafka.producer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerConfig {

    @Autowired
    private DirectProcessor<String> source;

    @Bean
    public Supplier<Flux<String>> producer(){
        return () -> Flux.from(source)
                .doOnNext( t -> System.out.println("Entro al metodo producer"));
    }
}
