package com.my.springMVCController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
public class MyController {

    @RequestMapping("test01")
    public String test01(){
        System.out.println("success");
        return "redirect:/success.jsp";
    }
}
