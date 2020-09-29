package com.consumer.listener;

import com.consumer.dto.PayloadCustomers;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    Logger LOG = LoggerFactory.getLogger(KafkaListeners.class);

    @KafkaListener(topics = "dbserver1.inventory.customers", groupId = "test-consumer-group")
    void listener(@Payload String message) {
        LOG.info(message);

    }
}
