package com.exam.avis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AvisApplication {
    public static void main(String[] args) { SpringApplication.run(AvisApplication.class, args); }
}
