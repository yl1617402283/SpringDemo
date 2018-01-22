package com.demo.listener;

import com.demo.beanTest.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent( new DemoEvent( this, msg));
    }
}
