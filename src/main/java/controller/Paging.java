package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;

import java.util.List;

@Controller
public class Paging {

    @GetMapping("/")
    public String homePage(){
        return "HomePage";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "Register";
    }

    @GetMapping("/content")
    public String contentPage(){
        return "Content";
    }
}
