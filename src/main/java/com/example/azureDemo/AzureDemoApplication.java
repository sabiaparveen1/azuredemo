package com.example.azureDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoApplication {

    @GetMapping("/message")
    public String message() {
        return "Congrats sabia!! Your application is deployed on azure platform.. ";
    }

    public static void main(String[] args) {
        SpringApplication.run(AzureDemoApplication.class, args);
    }

}
