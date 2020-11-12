package com.gzl.Test;

import com.gzl.dao.SysUserDao;
import com.gzl.domain.SysUser;
import com.gzl.service.SysUserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestSpring {

    @Test
    public void run1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        SysUserService sysUserService = (SysUserService) ac.getBean("sysUserService");
        sysUserService.FindAll();
    }


    @Test
    public void run2() throws IOException {
        InputStream stream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = factory.openSession();

        SysUserDao dao = session.getMapper(SysUserDao.class);
        List<SysUser> sysUsers = dao.FindAll();
        for (SysUser user : sysUsers) {
            System.out.println(user);
        }
        session.close();
        stream.close();
    }
}
