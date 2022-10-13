package com.example.kafkaproducer;

import com.example.kafkaproducer.config.LogModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class KafkaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<String, LogModel> kafkaTemplate) {
//        return args -> {
//            LogModel logModel = new LogModel
//                    ("TNS", "testing", "My very first log, i'm so happy", 5);
//            kafkaTemplate.send("logging-service", logModel);
//        };
//    }

}
