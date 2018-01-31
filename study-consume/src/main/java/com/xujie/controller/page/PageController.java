package com.xujie.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by xj on 2018/1/9.
 */
@Controller
public class PageController {
    @RequestMapping("/indexPage")
    public  String indexPage(Map<String,Object> map){
        map.put("name","hello");
        return "index";
    }
}
