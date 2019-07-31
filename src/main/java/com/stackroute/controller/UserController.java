package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {
    @RequestMapping("/")
    public String welcome(ModelMap model)
    {
        User user=new User();
        user.setName("jyothi");
        model.addAttribute("result",user);
        return "index";
    }
}
