package com.ryx.dev.kafka.kafka.product;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ryx.dev.kafka.kafka.data.MessageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class KafkaProducter {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static Gson gson = new GsonBuilder().create();

    //发送消息方法
    public void send() {
        MessageData message = new MessageData();
        message.setId(UUID.randomUUID().toString());
        kafkaTemplate.send("test", gson.toJson(message));
    }

}
