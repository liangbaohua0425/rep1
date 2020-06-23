package com.my.controller;

import com.my.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("user")
public class MvcTest01 {

    @RequestMapping("form")
    public String form(){
        return "/user/form";
    }

    @RequestMapping("add")
    public String add(User user){
        System.out.println(user);
        return "/success";
    }

    @RequestMapping("upload")
    public String upload(){
        return "/user/upload";
    }

    @RequestMapping("file")
    public String upload(String photoName,MultipartFile file){
        System.out.println(photoName);
        System.out.println(file.getOriginalFilename());
        return "/success";
    }

    @RequestMapping("homework")
    public String homework(MultipartFile file) throws IOException {
        //上传一个文件，获取文件的原始名称，判断是否是.jpg结尾，
        //如果是输出到本地磁盘中
        //判断文件是否为null
        if(file != null){
            //获取文件的原始名称
            String name = file.getOriginalFilename();
            if(name.length()>0 && name.endsWith(".jpg")){
                //生成一个随机数
                UUID uuid = UUID.randomUUID();
                file.transferTo(new File("H:\\pinyougou\\"+uuid+".jpg"));
            }
        }
        return "/success";
    }
}
