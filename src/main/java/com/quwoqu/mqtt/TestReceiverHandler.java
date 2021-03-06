package com.quwoqu.mqtt;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

/**
 * @author: qlaall
 * @Date:2018/7/23
 * @Time:21:05
 */
@MqttMessageReceiverHandler(topic = "qilei-test")
@Component
public class TestReceiverHandler implements MessageHandler {

    @Override
    public void handleMessage(Message<?> message) throws MessagingException {
        Object payload = message.getPayload();
        System.out.println(payload);
    }

}
