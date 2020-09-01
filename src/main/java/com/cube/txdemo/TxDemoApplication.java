package com.cube.txdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cube.txdemo.dao")
@SpringBootApplication
public class TxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxDemoApplication.class, args);
    }

}
