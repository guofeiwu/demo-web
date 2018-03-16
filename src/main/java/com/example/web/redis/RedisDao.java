package com.example.web.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;


/**
 * @author guofei_wu
 */
@Repository
public class RedisDao {

    @Autowired
    private StringRedisTemplate template;
    public static Logger logger = LoggerFactory.getLogger(RedisDao.class);

    @CachePut(cacheNames = "user", key = "'user' + #p0.name")
    public User setUser(User user) {
        logger.info("保存用户：" + user.getName());
        return user;
    }


    @Cacheable(cacheNames = "user", key = "'user' + #p0")
    public User getUser(String name) {
        logger.info("获取用户：" + name);
        User user = new User(1, "jack", 22);
        return user;
    }


    @CacheEvict(value = "user", key = "'user' + #p0")
    public int deleteById(String name) {
        logger.info("删除用户：" + name);
        return 1;
    }


}