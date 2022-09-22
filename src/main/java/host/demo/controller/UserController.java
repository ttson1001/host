package host.demo.controller;

import host.demo.model.User;
import host.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepo userRepo;


    @GetMapping("user")
    public List<User> getUser(){
        return userRepo.findAll();
    }

}
