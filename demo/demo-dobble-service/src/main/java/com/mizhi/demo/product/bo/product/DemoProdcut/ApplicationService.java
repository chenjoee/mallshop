package com.mizhi.demo.product.bo.product.DemoProdcut;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ApplicationService {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationService.class, args);
    }
}
