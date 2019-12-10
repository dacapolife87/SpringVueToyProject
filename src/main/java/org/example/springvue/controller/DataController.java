package org.example.springvue.controller;


import lombok.extern.slf4j.Slf4j;
import org.example.springvue.domain.ResponseVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping(value = "/api")
public class DataController {


    @GetMapping("/getData")
    public @ResponseBody ResponseVO<?> getData(){
        ResponseVO resp = new ResponseVO();
        log.info("getData!!!!");
        resp.setResponse("TEST");

        return resp;
    }

    @GetMapping("/getDataWorld")
    public @ResponseBody ResponseVO<?> getDataWorld(){
        ResponseVO resp = new ResponseVO();
        log.info("getDataWorld!!!!");
        resp.setResponse("Hello Vue World!");

        return resp;
    }

}
