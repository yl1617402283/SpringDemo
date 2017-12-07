package com.demo.controller;

import com.demo.pojo.User;
import com.demo.service.SpringBootDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
}
