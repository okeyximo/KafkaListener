package com.ximo.ximoconsumer.service;

import com.ximo.ximoconsumer.model.TransactionMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = {"transaction-topic"}, groupId = "group-id")
    public void consume(TransactionMessage transactionMessage) {
        log.info("We received the transaction with the id {}, the status is {}", transactionMessage.getTransactionId(), transactionMessage.getStatus());
    }

}
