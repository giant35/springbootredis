/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springbootredis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 *
 * @author sihai
 */
@Configuration
public class RedisConfig {

//    @Bean
//    RedisTemplate<String, String> t(RedisConnectionFactory f) {
//        return new StringRedisTemplate(f);
//    }
}
