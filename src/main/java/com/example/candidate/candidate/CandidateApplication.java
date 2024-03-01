package com.example.candidate.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CandidateApplication {

    @Autowired
    private CondidatRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(CandidateApplication.class, args);
    }


        @Bean
        ApplicationRunner init() {
            return (args) -> {
                repository.save(new Condidat("Mariem"));
                repository.save(new Condidat("Sarra"));
                repository.save(new Condidat("Mohamed"));
                repository.findAll().forEach(System.out::println);
            };
        }

    }

