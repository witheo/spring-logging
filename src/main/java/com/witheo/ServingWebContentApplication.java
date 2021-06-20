package com.witheo;

import com.witheo.marker.Markers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.helpers.BasicMarker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServingWebContentApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServingWebContentApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("This is a warn message");
        LOGGER.error("This is an error message");
        LOGGER.error(Markers.FATAL, "This is a fatal error message");
        LOGGER.error(Markers.ON_CALL, "This is a on-call error message");
        LOGGER.error(Markers.BOSS_DEVS, "This is a boos-devs error message");
    }

}