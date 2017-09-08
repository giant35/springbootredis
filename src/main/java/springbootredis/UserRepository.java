/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springbootredis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sihai
 */
@Repository
public class UserRepository {

    private static final Logger LOG = Logger.getLogger(UserRepository.class.getName());

    @Autowired
    //not work RedisTemplate<String, Object> redis;
    RedisTemplate<String, String> redis;

    public String put(User u) {
        final String key = u.getClass().getName() + "-" + u.id;
        final String val = JsonHelper.obj2json(u);
        redis.opsForValue().set(key, val);
        //LOG.info("val:" + val);
        return key;
    }

}
