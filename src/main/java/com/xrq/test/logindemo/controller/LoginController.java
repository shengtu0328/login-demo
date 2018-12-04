package com.xrq.test.logindemo.controller;


import com.xrq.test.logindemo.entity.User;
import com.xrq.test.logindemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = {"/login"})
    public String login() {
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = {"/loginCheck"}, method = RequestMethod.POST)
    public String loginCheck(String name, String password) {
        if (userRepository.findByNameAndPassword(name, password).size() > 0)
            return "登录成功";
        else
            return "登录失败";
    }

    @RequestMapping(value = {"/register"})
    public String register() {
        return "register";
    }

    @ResponseBody
    @RequestMapping(value = {"/registerCheck"}, method = RequestMethod.POST)
    public String registerCheck(User user) {

        if (userRepository.findByName(user.getName())!=null) {
            return "注册失败";
        } else {
            userRepository.save(user);
            return "注册成功";
        }
    }

    @RequestMapping(value = {"/sanjiliandong"})
    public String sanjiliandong() {
        return "sanjiliandong";
    }

}
