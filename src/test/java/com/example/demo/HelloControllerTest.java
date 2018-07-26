package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @Test
    public void hello() {
        helloController.hello();
    }

    @Test
    public void testException() {
    }

    @Test
    public void getUser() {
    }

    @Test
    public void newUser() {
    }

    @Test
    public void modifyUser() {
    }

    @Test
    public void deleteUser() {
    }
}