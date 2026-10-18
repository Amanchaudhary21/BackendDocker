package in.stricks.backenddocker.controller;

import in.stricks.backenddocker.model.Users;
import in.stricks.backenddocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }
}
