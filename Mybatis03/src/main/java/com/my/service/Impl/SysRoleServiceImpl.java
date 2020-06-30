package com.my.service.Impl;

import com.my.mapper.SysRoleMapper;
import com.my.pojo.SysRole;
import com.my.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl implements ISysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    public SysRole findById(Integer id){
        return sysRoleMapper.findById(id);
    }

    public List<SysRole> findAll(){
        return sysRoleMapper.findAll();
    }
}
