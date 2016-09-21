package com.h.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by huangshuaihui on 16/8/22.
 */
@SpringBootApplication
@EnableSwagger2
public class Application {
    private static Logger logger = Logger.getLogger(Application.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        logger.warning("wwwwwwww");
        logger.log(Level.WARNING,"warning");
    }
}
