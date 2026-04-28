package com.codingshuttle.Module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay(){
        System.out.println("Paying ... !");
    }

    @PostConstruct
    public void prePay(){
        System.out.println("Before Paying... !");
    }

    @PreDestroy
    public void postPay(){
        System.out.println("Payed !!!");
    }
}
