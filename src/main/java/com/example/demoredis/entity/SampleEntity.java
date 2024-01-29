package com.example.demoredis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SampleEntity {

    private String id;

    String message;
}
