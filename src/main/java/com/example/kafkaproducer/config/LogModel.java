package com.example.kafkaproducer.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LogModel {
    private String database;
    private String collection;
    private String message;
    private int deletionOffset;
}
