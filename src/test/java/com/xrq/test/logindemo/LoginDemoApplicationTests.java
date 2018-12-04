package com.xrq.test.logindemo;

import com.xrq.test.logindemo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginDemoApplicationTests {


    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
    }


    @Test
    public void login() {
        userRepository.findByNameAndPassword("xrq", "123").stream().forEach(System.out::println);
    }
}
