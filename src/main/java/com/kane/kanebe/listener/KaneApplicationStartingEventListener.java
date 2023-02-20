package com.kane.kanebe.listener;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author kane
 * @apiNote ApplicationStartingEvent 는 ApplicationContext가 만들어지기전 event이므로
 * listener가 제대로 동작하지 않음
 * 따라서 bean으로 등록하지 않고 KaneBeApplication에서 listener를 등록하여 사용
 */

//@Component
@Slf4j
public class KaneApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

//    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * @param event the event to respond to '시작 시'
     */
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
//        ApplicationContext가 등록되지 전이므로 LOGGER 동작하지 않음
//        LOGGER.info("KaneBeApplication Start: " + event.getTimestamp());
        System.out.println("KaneBeApplication Start: " + event.getTimestamp());
    }
}
