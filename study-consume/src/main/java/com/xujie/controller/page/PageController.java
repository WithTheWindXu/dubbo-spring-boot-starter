package com.xujie.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by xj on 2018/1/9.
 */
@Controller
public class PageController {

    @RequestMapping("/indexAction")
    public  String index(){
        return "index";
    }

    @RequestMapping("/loginAction")
    public  String login(){
        return "login";
    }
}
