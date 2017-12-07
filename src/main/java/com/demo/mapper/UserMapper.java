package com.demo.mapper;

import com.demo.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUserById(Integer id);
}
