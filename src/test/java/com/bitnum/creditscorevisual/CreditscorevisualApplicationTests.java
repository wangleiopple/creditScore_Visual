package com.bitnum.creditscorevisual;

import com.bitnum.creditscorevisual.entity.User;
import com.bitnum.creditscorevisual.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class CreditscorevisualApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    RedisUtil redisUtil;


    @Test
    public void testInsert(){
        User user = new User();
        user.setName("LiYi");
        user.setAge(28);
        redisUtil.set("LiYi",user);
    }

}
