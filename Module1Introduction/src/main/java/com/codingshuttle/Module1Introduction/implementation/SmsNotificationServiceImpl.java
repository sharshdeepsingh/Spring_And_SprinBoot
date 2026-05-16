package com.codingshuttle.Module1Introduction.implementation;

import com.codingshuttle.Module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNotif")
@ConditionalOnProperty(name = "notification.type", havingValue = "sms")

public class SmsNotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sms sending :"+ message);
    }
}
