package com.example.ms1.note.siteuser;

import com.example.ms1.note.note.NoteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
private final UserService userService;
    @GetMapping("/signup")
    public String signup(UserCreateDto userCreateDto){
        return "signup_form";
    }

    @PostMapping("/signup")
    public String signup(@Valid UserCreateDto userCreateDto , BindingResult bindingResult){
        if(bindingResult.hasErrors ()){
            return "signup_form";
        }
        userService.createUser(userCreateDto.getLoginId (),userCreateDto.getPassword (),userCreateDto.getNickname (),userCreateDto.getEmail ());
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "login_form";
    }
}
