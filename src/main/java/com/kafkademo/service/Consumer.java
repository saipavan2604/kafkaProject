package com.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="saiproducer_ToicName1",groupId="saiproduce_Group1")
	public void listenToTopic(String receivedMessage) {
		System.out.print(receivedMessage);
	}
}
