package com.emoore36.recipepantry.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.emoore36.recipepantry.util.dto.DTO;
import com.emoore36.recipepantry.util.dto.success.SingleSuccessDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<DTO> test() {
        logger.info("Test endpoint accessed");
        DTO dto = new SingleSuccessDTO<>(HttpStatus.OK, "Success!", null);
        return ResponseEntity.status(dto.getHttpStatus()).body(dto);
    }

}
