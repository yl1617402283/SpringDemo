package com.demo.service;

import com.demo.pojo.User;

public interface SpringBootDemoService {

    User getUserById(Integer id);

    String getOsString ();
}
