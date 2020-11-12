package com.gzl.service;

import com.gzl.domain.SysUser;

import java.util.List;

public interface SysUserService {
    public List<SysUser> FindAll();

    public void Save(SysUser user);
}
