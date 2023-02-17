package com.kane.kanebe.runner;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: Kane
 * Application 실행한 뒤 바로 무언가 실행하고 싶을 때 사용
 */

@Component
@Order(1) // OREDER로 실행한 뒤 Runner에 대해 실행 가능
@Slf4j
public class KaneApplicationRunner implements ApplicationRunner {

//    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * @param args incoming application arguments
     * @throws Exception
     * JVM Option은 제외이고 -- 옵션만 보여짐
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.debug("KaneBeApplication Argument: " + args.getOptionNames());
    }
}
