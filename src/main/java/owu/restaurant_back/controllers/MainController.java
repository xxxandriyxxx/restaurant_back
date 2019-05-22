package owu.restaurant_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import owu.restaurant_back.models.Role;
import owu.restaurant_back.models.User;
import owu.restaurant_back.service.UserService;

@RestController

public class MainController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

//    @GetMapping("/")
//    public String home(){
//        return "home";
//    }

    @PostMapping("/save")
    public @ResponseBody
    String home(@RequestParam String username,
                       @RequestParam String password) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.save(user);
        return user.toString();
    }


    @GetMapping("/get")
    public String get() {
        return "get it";
    }

    @GetMapping("/admin")
    public String admin() {
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
