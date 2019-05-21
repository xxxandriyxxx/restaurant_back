package owu.restaurant_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import owu.restaurant_back.models.User;
import owu.restaurant_back.service.UserService;

@RestController

public class MainController {

//    @GetMapping("/")
//    public String home(){
//        return "home";
//    }

@GetMapping("/get")
public String get(){
    return "get it";
}

@GetMapping("/admin")
public String admin(){
    return "hello admin !!!";
}

//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @PostMapping("/saveUser")
//    public String saveUser(User user){
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userService.save(user);
//        return "redirect:/login";
//    }
}
