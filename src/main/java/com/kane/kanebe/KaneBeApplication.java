package com.kane.kanebe;

import com.kane.kanebe.listener.KaneApplicationStartingEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class KaneBeApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+9:00"));

        SpringApplication app = new SpringApplication(KaneBeApplication.class);
        app.addListeners(new KaneApplicationStartingEventListener());
        app.run(args);

//        SpringApplication.run(KaneBeApplication.class, args);
    }

}
