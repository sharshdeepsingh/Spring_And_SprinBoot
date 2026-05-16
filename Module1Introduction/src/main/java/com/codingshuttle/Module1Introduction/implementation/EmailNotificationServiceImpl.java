package com.codingshuttle.Module1Introduction.implementation;

import com.codingshuttle.Module1Introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
@Qualifier("emailNotif")
@ConditionalOnProperty(name = "notification.type", havingValue = "email")
public class EmailNotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Sending:"+ message);
    }
}
