package org.example.springvue.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@Controller
@ControllerAdvice
public class CommonController implements ErrorController {

//    @GetMapping(value = "/helloVue")
//    public String helloVue() {
//        log.info("Hello!");
//        return "index.html";
//    }
    //TEST
    @GetMapping("/error")
    public String commonError(HttpServletRequest request) {
        log.info("HelloError!");
        log.info(request.getRequestURI());
        return "index.html";
    }


    @Override
    public String getErrorPath() {
        return "/error";
    }
}
