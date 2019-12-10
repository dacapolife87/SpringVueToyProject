package org.example.springvue.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@Controller
public class HelloController {



    @GetMapping(value = {"/vue", "/hellovue"})
    public String helloVueWorld(HttpServletRequest request) {
        log.info("Hello!");
        log.info(request.getRequestURI());
        return "index.html";
    }

}
