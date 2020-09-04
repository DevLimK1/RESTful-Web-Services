package com.devlimk1.restfulwebservice.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserDaoService service;

    public UserController(UserDaoService service){
        this.service=service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){//사용자 목록 조회
        return service.findAll();
    }

    // GET /users/1 ->String 으로 전달 됨 -> 자동으로 int id로 캐스팅 됨
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){//사용자 목록 조회
        return service.findOne(id);
    }

}
