package com.pseudopro.kafka.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KafkaMain {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(KafkaMain.class);
        logger.info("SLF4J logger...");
        System.out.println("Kafka starting...");
    }
}
