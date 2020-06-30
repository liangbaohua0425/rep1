package com.my.controller;

import com.my.pojo.SysRole;
import com.my.pojo.SysUser;
import com.my.service.ISysRoleService;
import com.my.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private ISysUserService sysUserService;

    @Autowired
    private ISysRoleService sysRoleService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<SysUser>  findAll(){
        List<SysUser> all = sysUserService.findAll();
        for (SysUser sysUser : all) {
            System.out.println(sysUser);
        }
        return all;
    }

    @RequestMapping("findAllRole")
    @ResponseBody
    public List<SysUser>  findAllRole(){
        List<SysUser> all = sysUserService.findAllRole();
        for (SysUser sysUser : all) {
            System.out.println(sysUser);
        }
        return all;
    }

    @RequestMapping("findAllUser")
    @ResponseBody
    public List<SysRole>  findAllUser(){
        List<SysRole> all = sysRoleService.findAll();
        for (SysRole sysRole : all) {
            System.out.println(sysRole);
        }
        return all;
    }
}
