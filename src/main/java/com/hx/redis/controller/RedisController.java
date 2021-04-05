package com.hx.redis.controller;

import com.hx.redis.pojo.Page;
import com.hx.redis.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class RedisController {
    @Resource
    StringRedisTemplate stringRedisTemplate;

    @ApiOperation("浏览量增加")
    @GetMapping("/redis/increment")
    public  String incre(){
        stringRedisTemplate.opsForValue().increment("views");
        return (String) stringRedisTemplate.opsForValue().get("views");
    }

    @ApiOperation("浏览量减少")
    @GetMapping("/redis/decrement")
    public  String decre(){
        stringRedisTemplate.opsForValue().decrement("views");
        return stringRedisTemplate.opsForValue().get("views");
    }

    @ApiOperation("浏览量增加")
    @GetMapping("/redis/getOnePage/{name}")
    public User getOnePage(@PathVariable @ApiParam("用户名") String name){
        final Page page = new Page();
        final User user = new User();
        return user;
    }

}
