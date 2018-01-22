package com.demo.beanTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
@ComponentScan
public class BeanClass {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanClass beanWayService(){
        System.out.println("--------------------------------------is bean init method");
        return new BeanClass();
    }


    @PostConstruct
    public void init(){
        System.out.println("============================================is bean init method");
    }

    public void bean(){
        System.out.println("is bean method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("=============================================is bean destroy method");
    }
}
