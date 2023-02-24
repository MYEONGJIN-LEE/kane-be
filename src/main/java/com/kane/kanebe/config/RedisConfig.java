package com.kane.kanebe.config;

import com.kane.kanebe.exception.SystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author kane
 * @apiNote redis configuration 설정
 * TODO : session repository에 redis 이용 추가할 것
 */
@Configuration
@EnableRedisRepositories
public class RedisConfig {
    @Value("${spring.redis.port}")
    private int redisPort;

    @Value("${spring.redis.endpoint}")
    private String redisEndpoint;

    @Value(value = "${spring.redis.prefix}")
    private String redisPrefix;

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * Netty 기반 ConnectionFactory
     *
     * @return
     * @throws SystemException
     */
    @Bean
    public RedisConnectionFactory redisConnectionFactory() throws SystemException {
        LettuceConnectionFactory lettuceConnectionFactory;
        try {
            lettuceConnectionFactory = new LettuceConnectionFactory(redisEndpoint, redisPort);
            // 패스워드가 있는경우
            // lettuceConnectionFactory.setPassword("");
            LOGGER.info("Redis Endpoint >>> " + redisEndpoint);
        } catch (Exception exception) {
            LOGGER.error("Redis Config Exception : " + exception);
            throw new SystemException(exception.getMessage());
        }
        return lettuceConnectionFactory;
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() throws SystemException {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(this.redisConnectionFactory());
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        // redisTemplate.setValueSerializer(new
        // Jackson2JsonRedisSerializer<>(UserEntity.class)); //
        // <- 주고 받을 데이터(Entity)를 미리 설정 할때
        return redisTemplate;
    }
}
