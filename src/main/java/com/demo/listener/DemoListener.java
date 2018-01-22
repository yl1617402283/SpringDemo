package com.demo.listener;

import com.demo.beanTest.DemoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Controller;

@Controller
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent event) {

        String msg = event.getMsg();

        System.out.println("this is listener msg:" + msg);
    }
}
