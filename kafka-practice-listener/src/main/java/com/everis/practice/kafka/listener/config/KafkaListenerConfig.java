package com.everis.practice.kafka.listener.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;
import java.util.function.Function;

@Configuration
public class KafkaListenerConfig {

    @Bean
    public Function<Flux<String>, Flux<String>> processor(){
        return flux -> flux.doOnNext( t -> System.out.println("Entro al processor y el texto es: "+ t));
    }

    @Bean
    public Consumer<Flux<String>> consumer(){
        return (texto) -> {
            System.out.println("Consumer Received : " + texto);
        };
    }
}
