package com.codingshuttle.Module1Introduction;

import com.codingshuttle.Module1Introduction.implementation.SmsNotificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

    // 1️⃣ Field Injection
    @Autowired
    private PaymentService paymentService;

    // 2️⃣ Constructor Injection (primary - most recommended)
    private final NotificationService notificationService;
//
//    // 3️⃣ Setter Injection
//    private NotificationService smsNotificationService;

    // Constructor - Spring injects NotificationService here
    @Autowired
    public Module1IntroductionApplication( NotificationService notificationService) {
        this.notificationService = notificationService;
    }

//    // Setter - Spring calls this to inject
//    @Autowired
//    public void setSmsNotificationService(SmsNotificationServiceImpl smsNotificationService) {
//        this.smsNotificationService = smsNotificationService;
//    }

    public static void main(String[] args) {
        SpringApplication.run(Module1IntroductionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        notificationService.sendNotification("Good Morning via Constructor!");

//        // Using Setter Injection
//        System.out.println("--- Setter Injection ---");
//        smsNotificationService.sendNotification("Good Morning via Setter!");
    }
}