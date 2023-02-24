package com.kane.kanebe.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.time.Duration;

/**
 * @author kane
 * @apiNote api 호출 시 사용 함
 * TODO : feign으로 변경할 것
 */
//@Configuration
//public class RestTemplateConfig {
//    @Bean
//    public RestTemplate restTemplate(final RestTemplateBuilder restTemplateBuilder) {
//        HttpComponentsClientHttpRequestFactory factory =
//                new HttpComponentsClientHttpRequestFactory();
//        return restTemplateBuilder
//                .requestFactory(() -> factory)
//                .setConnectTimeout(Duration.ofMillis(5000)) // connection-timeout
//                .setReadTimeout(Duration.ofMillis(5000)) // read-timeout
//                .additionalMessageConverters(
//                        new StringHttpMessageConverter(Charset.forName("UTF-8")))
//                .defaultHeader("Content-Type", "application/json")
//                .build();
//    }
//}
