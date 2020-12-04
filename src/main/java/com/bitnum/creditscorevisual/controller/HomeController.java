package com.bitnum.creditscorevisual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){

        return "/views/index";
    }
    @RequestMapping("/index2")
    public String index2(){

        return "/views/index2";
    }
    @RequestMapping("/show/1")
    public String showEnterpriseDistributionData(){
        return "/showData/EnterpriseDistributionData";
    }
}
