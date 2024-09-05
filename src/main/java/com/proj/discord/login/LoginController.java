package com.proj.discord.login;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Getter
@Setter
@Controller
public class LoginController {
    @GetMapping("/login")
    @ResponseBody
    public String index(){
        return "login";
    }
}