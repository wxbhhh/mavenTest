package com;

import bean.User;
import dao.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootConfiguration
@Controller
@SpringBootApplication
public class MyConfig {

    @Bean
    public User createUser(){
        User user=new User();
        user.setName("小明");
        user.setPassword("123456");
        return user;
    }

    @Bean
    public UserDao createUserDao(User user){
        UserDao userDao = new UserDao();
        userDao.setUser(user);
        return userDao;
    }

    @RequestMapping("hello")
    @ResponseBody
    String hello(){
        return "hello idea spring-boot";
    }

    public static void main(String args[]){
        SpringApplication.run(MyConfig.class,args);
        /*ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
        UserDao userdao=ac.getBean(UserDao.class);
        userdao.show();*/
    }
}
