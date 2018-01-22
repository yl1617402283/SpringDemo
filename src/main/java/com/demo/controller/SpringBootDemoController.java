package com.demo.controller;

import com.demo.beanTest.BeanClass;
import com.demo.beanTest.DemoEvent;
import com.demo.listener.DemoPublisher;
import com.demo.listener.EventConfig;
import com.demo.pojo.User;
import com.demo.service.SpringBootDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@Controller
@RequestMapping("/springdemo")
public class SpringBootDemoController {

    @Autowired
    private SpringBootDemoService springBootDemoService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(HttpServletRequest request) {
        int id = Integer.valueOf(request.getParameter("id"));
        User user = springBootDemoService.getUserById(id);
        return user;
    }

    @RequestMapping("/getOsString")
    @ResponseBody
    public String getOsString(HttpServletRequest request) {
        String osString = springBootDemoService.getOsString();
        return osString;
    }

    @RequestMapping("/getBean")
    @ResponseBody
    public void getBean(HttpServletRequest request) {
        BeanClass bean = new BeanClass();
        bean.bean();
    }

    @RequestMapping("/DemoListener")
    @ResponseBody
    public void DemoListener(HttpServletRequest request) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("============== hello application event! ============");
        context.close();
    }

}
