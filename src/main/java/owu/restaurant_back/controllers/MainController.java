package owu.restaurant_back.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
