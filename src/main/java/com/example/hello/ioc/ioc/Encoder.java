package com.example.hello.ioc.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder(@Qualifier("base64Encoder") IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }
}
