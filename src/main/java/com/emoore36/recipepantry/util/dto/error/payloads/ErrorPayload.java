package com.emoore36.recipepantry.util.dto.error.payloads;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Abstract base class for error payloads.
 */
@ToString
@EqualsAndHashCode
public abstract class ErrorPayload {

    private final String developerMessage;
    private final String userMessage;

    /**
     * Create an instance of the abstract ErrorPayload class.
     * 
     * @param developerMessage the error message for the developer
     * @param userMessage      the error message for the end user
     */
    protected ErrorPayload(String developerMessage, String userMessage) {
        this.developerMessage = developerMessage;
        this.userMessage = userMessage;
    }

    /**
     * Gets the error message for the developer
     * 
     * @return the error message for the developer
     */
    public String getDeveloperMessage() {
        return this.developerMessage;
    }

    /**
     * Gets the error message for the end user
     * 
     * @return the error message for the end user
     */
    public String getUserMessage() {
        return this.userMessage;
    }

}
