package com.example.hello;

import com.example.hello.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("-----------");

        var objectMapper = new ObjectMapper();

        var user = new User("steve", 10, "123123");
        var text = objectMapper.writeValueAsString(user);
        System.out.println("text = " + text);

        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println("objectUser = " + objectUser);
    }

}
