package com.example.redisstorage.controller;

import com.example.redisstorage.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RedisController {
    private final RedisService redisService;

    @GetMapping("/save/{key}/{value}")
    public String saveToRedis(@PathVariable String key, @PathVariable String value) {
        redisService.saveToRedis(key, value);
        return "Redis에 데이터 저장";
    }

    @GetMapping("/get/{key}")
    public String getFromRedis(@PathVariable String key) {
        return "Redis로 부터 데이터 가져오기: " + redisService.getFromRedis(key);
    }
}
