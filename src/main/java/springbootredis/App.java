/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springbootredis;

import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 *
 * @author sihai
 */
@SpringBootApplication
public class App {

    public static void main(String[] argv) {
        SpringApplication.run(App.class, argv);
    }

    @Bean
    public CommandLineRunner r(UserRepository repo, StringRedisTemplate redis) {
        return (argv) -> {
            User u = new User();
            u.id = 1;
            u.name = "李钱";
            u.birthday = LocalDate.of(1998, 1, 2);
            final String key = repo.put(u);
            final String ug = (String) redis.opsForValue().get(key);
            System.out.println("user:" + ug);
        };
    }
}
