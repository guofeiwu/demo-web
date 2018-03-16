package com.example.web;

import com.example.web.redis.RedisDao;
import com.example.web.redis.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

/**
 * @author guofei_wu
 * @date 2018/3/15 16:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    public static Logger logger= LoggerFactory.getLogger(RedisTest.class);
    @Autowired
    RedisDao redisDao;



    @Test
    public void testSetUser() {
        // User user = new User(1,"jack",20);
        User user = new User(2,"tom",22);
       redisDao.setUser(user);
    }


    @Test
    public void testGetUser(){
//        User user = redisDao.getUser("jack");
        User user = redisDao.getUser("tom");
        System.out.println(user);
    }


    @Test
    public void testDeleteUser() {
       logger.info(redisDao.deleteById("tom")+"");
    }




}
