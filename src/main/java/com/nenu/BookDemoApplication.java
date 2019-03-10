package com.nenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.nenu.mapper")
public class BookDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookDemoApplication.class, args);
    }

}
