package com.emoore36.recipepantry.util.dto;

import org.springframework.http.HttpStatus;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * An abstract base class for Data Transfer Objects (DTOs)
 */
@ToString
@EqualsAndHashCode
public abstract class DTO {
    private final HttpStatus httpStatus;
    private final String responseMessage;

    /**
     * Creates an instance of the DTO parent class.
     * 
     * @param httpStatus      the HTTP status of the DTO
     * @param responseMessage the response message of the DTO
     */
    protected DTO(HttpStatus httpStatus, String responseMessage) {
        this.httpStatus = httpStatus;
        this.responseMessage = responseMessage;
    }

    /**
     * Gets the HTTP status
     * 
     * @return the HTTP status
     */
    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    /**
     * Gets the response message
     * 
     * @return the response message
     */
    public String getResponseMessage() {
        return this.responseMessage;
    }
}
