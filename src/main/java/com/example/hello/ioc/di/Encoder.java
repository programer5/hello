package com.example.hello.ioc.di;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }


    public String encode(String message) {
        return iEncoder.encode(message);
    }
}
