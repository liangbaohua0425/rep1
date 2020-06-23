package com.my.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("my")
public class MyController {

    @RequestMapping("upload/{username}")
    @ResponseBody
    public void upload(@PathVariable("username") String username, MultipartFile file){
        System.out.println(username);
        System.out.println(file);
    }

    @RequestMapping("getCookie")
    @ResponseBody
    public void getCookie(@CookieValue("JSESSIONID") String cookie){
        System.out.println(cookie);
    }

    @RequestMapping("getRequestHeader")
    @ResponseBody
    public void getRequestHeader(@RequestHeader("User-Agent") String userAgent,
                                 @RequestHeader("Host") String host){
        System.out.println(userAgent);
        System.out.println(host);
    }

}
