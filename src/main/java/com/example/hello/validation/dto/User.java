package com.example.hello.validation.dto;

import com.example.hello.validation.annotation.YearMonth;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class User {

    @NotBlank
    private String name;

    @Max(value = 90)
    private int age;

//    @Email
//    private String email;
//
//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx") //핸드폰 정규식
//    private String phoneNumber;

//    @YearMonth
//    private String requestYearMonth; // yyyyMM

    @Valid
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

//    public String getRequestYearMonth() {
//        return requestYearMonth;
//    }
//
//    public void setRequestYearMonth(String requestYearMonth) {
//        this.requestYearMonth = requestYearMonth;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
