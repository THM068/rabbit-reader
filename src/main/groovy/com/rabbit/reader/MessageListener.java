package com.rabbit.reader;

import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;

@RabbitListener
public class MessageListener {

    @Queue(value = "Thando_testques")
    public void receive(byte[] data) {
        String message = new String(data);
        //System.out.println(message);
        if(message.contains("CHANGE_PASSWORD_REQUESTED")  ) {
            System.out.println(message);
        }
    }
}
