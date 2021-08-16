package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
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


}
