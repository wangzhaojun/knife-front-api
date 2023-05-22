package com.dave.view;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author 小猪佩奇
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "com.dave")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info(Application.class.getSimpleName() + " 启动成功!");
    }
}
