package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import com.example.hello.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // 해당 Class는 REST API 처리하는 Controller
@RequestMapping("/api") // RequestMapping URI 를 지정하는 Annotation
public class ApiController {

    @GetMapping("hello") // http://localhost:9090/api/hello
    public String hello() {
        return "hello spring boot";
    }

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestDto) {
        System.out.println(requestDto);
    }

    @PutMapping("/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable Long userId) {

        System.out.println("requestDto = " + requestDto);
        System.out.println(userId);

        return requestDto;

    }

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {
        System.out.println(userId);
        System.out.println(account);

        // delete -> 리소스 삭제 200 OK
    }

    //TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    //JSON
    //req -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user; // 200 OK
    }

    // ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
