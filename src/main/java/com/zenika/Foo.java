package com.zenika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Foo {

    @Autowired
    public Foo(Bar bar, @Value("${foo}") String foo) {
        System.out.println("Foo.Foo");
    }

    @Autowired
    public void setBar(Bar bar) {
        System.out.println("Foo.setBar");
    }

    @PostConstruct
    void postConstruct() {
        System.out.println("Foo.postConstruct");
    }
}
