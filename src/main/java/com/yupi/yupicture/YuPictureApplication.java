package com.yupi.yupicture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.yupi.yupicture.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class YuPictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuPictureApplication.class, args);
    }

}
