package com.example;

import com.example.entity.SysUser;
import com.example.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DatasourceDemoApplicationTests {

    @Autowired
    SysUserService userService;

    @Test
    void contextLoads() {
        SysUser user = userService.getById(1);
        System.out.println(user.toString());
    }

    @Test
    public void test() {
        SysUser user = userService.findUserByFirstDb(1);
        System.out.println("第one个数据库---------》" + user.toString());


        SysUser user2 = userService.findUserBySecondDb(1);
        System.out.println("第二个数据库---------》" + user2.toString());
    }

}
