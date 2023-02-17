package com.kane.kanebe.listener;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KaneApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {
//    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * @param event the event to respond to '시작했음'
     */
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("KaneBeApplication Started: " + event.getTimestamp());
    }
}
