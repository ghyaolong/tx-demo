package com.cube.txdemo.controller;

import com.cube.txdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/9/1 11:17
 * @DESC
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/transfer")
    public void transfer(){
        userService.transfer(BigDecimal.valueOf(20));
    }
}
