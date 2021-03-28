package com.pseudopro.kafka.test;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class KafkaMain {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(KafkaMain.class);
        logger.info("SLF4J logger...");
        System.out.println("Kafka starting...");

        // Create producer configs, refer to docs https://kafka.apache.org/documentation/#producerconfigs
        Map<String, Object> config = new HashMap<String, Object>();

        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(config);
        producer.send(new ProducerRecord<String, String>("firstTopic", "message from Java!"));
        producer.flush();
        producer.close();
    }
}
