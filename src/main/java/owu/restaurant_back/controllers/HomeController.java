package owu.restaurant_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import owu.restaurant_back.models.User;
import owu.restaurant_back.service.UserService;


@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/save")
    public String save(User user
//                           ,@AuthenticationPrincipal Authentication authentication,
//                           @AuthenticationPrincipal Principal principal,
//                           @AuthenticationPrincipal UserDetails userDetails
    ){
//        System.out.println("1" + " " + authentication.getName());
//        System.out.println("2" + " " + principal.getName());
//        System.out.println("3" + " " + userDetails.getUsername());
        System.out.println(user);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);
        return "redirect:/";
    }
}
