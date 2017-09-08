/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springbootredis;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author sihai
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RedisConfig.class, UserRepository.class})
public class UserRepositoryTest {

    public UserRepositoryTest() {
    }

    @Autowired
    UserRepository repo;

    @Autowired
    RedisTemplate<String, String> redis;

    @org.junit.Test
    public void testPut() {
        User u = new User();
        u.id = 1;
        u.name = "李钱";
        u.birthday = LocalDate.of(1998, 1, 2);
        final String key = repo.put(u);
        final String ug = (String) redis.opsForValue().get(key);
        System.out.print(ug);
    }

}
