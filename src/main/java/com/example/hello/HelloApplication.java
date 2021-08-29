package com.example.hello;

import com.example.hello.ioc.ioc.ApplicationContextProvider;
import com.example.hello.ioc.ioc.Base64Encoder;
import com.example.hello.ioc.ioc.Encoder;
import com.example.hello.ioc.ioc.UrlEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Base64;

@SpringBootApplication
@EnableAsync
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
        System.out.println(Base64.getEncoder().encodeToString("1231231235345.com".getBytes()));

//        ApplicationContext context = ApplicationContextProvider.getContext();
//
//        Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
//        UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);
//
//        Encoder encoder = context.getBean("base64Encode", Encoder.class);
//
//        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
//        String result = encoder.encode(url);
//        System.out.println("result = " + result);


    }

}

@Configuration
class AppConfig {

    @Bean("base64Encode")
    public Encoder encoder(Base64Encoder base64Encoder) {
        return new Encoder(base64Encoder);
    }

    @Bean("urlEncode")
    public Encoder encoder(UrlEncoder urlEncoder) {
        return new Encoder(urlEncoder);
    }
}
