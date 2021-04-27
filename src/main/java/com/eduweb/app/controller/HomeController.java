package com.eduweb.app.controller;


import com.eduweb.app.entity.Message;
import com.eduweb.app.service.MessageService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/")
public class HomeController {

    private final MessageService messageService;

    public HomeController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("about")
    public String about() {
        log.info("getMapping -> /  (about)");
        return "about";
    }

    @GetMapping("home")
    public String homePage() {
        log.info("getMapping -> /  (home)");
        return "index";
    }

//    @GetMapping("home")
//    public String single() {
//        log.info("getMapping -> /  (home)");
//        return "index";
//    }

    @GetMapping("contact")
    public String contact() {
        log.info("getMapping -> /  (contact)");
        return "contact";
    }
    @GetMapping("blog")
    public String blog(Model model) {

        log.info("getMapping -> /  (blog)");
        return "blog";
    }
    @PostMapping("sendMessage")
    public String form(Message message) {
        log.info("postMapping -> /  (home) "+ message);
        messageService.sendMessage(message);
        return "index";
    }
}
