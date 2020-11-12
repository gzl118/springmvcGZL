package com.gzl.service.impl;

import com.gzl.dao.SysUserDao;
import com.gzl.domain.SysUser;
import com.gzl.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public List<SysUser> FindAll() {
        System.out.println("查询所有");
        List<SysUser> sysUsers = sysUserDao.FindAll();
//        for (SysUser user : sysUsers) {
//            System.out.println(user);
//        }
        return sysUsers;
    }

    @Override
    public void Save(SysUser user) {
        System.out.println("保存单个");
    }
}
