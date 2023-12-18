package com.emoore36.recipepantry.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     * Tests to ensure that the application can be reached.
     * 
     * @return a ResponseEntity with a 200 response.
     */
    @GetMapping("/")
    public ResponseEntity<String> test() {
        logger.info("Test endpoint accessed");
        return ResponseEntity.ok().body("Success!");
    }

}
