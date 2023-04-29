package com.nashtech.sonarqube.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    void greeting() {
        HelloController helloController=new HelloController();
        String result = helloController.greeting();
        Assertions.assertEquals("hello", result);
    }
}