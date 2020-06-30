package com.my.service;

import com.my.pojo.SysUser;

import java.util.List;

public interface ISysUserService {

    SysUser findById(Integer id);

    List<SysUser> findAll();

    List<SysUser> findAllRole();
}
