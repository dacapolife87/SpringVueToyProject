package org.example.springvue.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class MainController {

    @GetMapping(value = {"/"})
    public String mainView(HttpServletRequest request) {
        log.info("Main Controller");
        log.info(request.getRequestURI());
        return "index.html";
    }
}
