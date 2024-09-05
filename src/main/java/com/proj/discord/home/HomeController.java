package com.proj.discord.home;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Getter
@Setter
@Controller
public class HomeController {
    @GetMapping("/home")
    @ResponseBody
    public String index(){
        return "home";
    }
}
