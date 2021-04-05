package com.hx.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
class RedisApplicationTests {
    @Test
    void jredis(){
        // 1、 new Jedis 对象即可
        Jedis jedis = new Jedis("81.68.225.241",6379);
        // jedis 所有的命令就是我们之前学习的所有指令！所以之前的指令学习很重要！
        System.out.println(jedis.ping());
    }

    @Test
    void contextLoads() {
    }

}
