package com.my.service.Impl;

import com.my.mapper.SysUserMapper;
import com.my.pojo.SysUser;
import com.my.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser findById(Integer id){
        return sysUserMapper.findById(id);
    }

    public List<SysUser> findAll(){
        return sysUserMapper.findAll();
    }

    public List<SysUser> findAllRole(){
        return sysUserMapper.findAllRole();
    }
}
