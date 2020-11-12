package com.gzl.dao;

import com.gzl.domain.SysUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserDao {

    @Select("select * from Sys_User")
    public List<SysUser> FindAll();

    public void Save(SysUser user);
}
