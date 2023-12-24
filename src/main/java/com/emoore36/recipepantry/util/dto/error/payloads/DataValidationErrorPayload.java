package com.emoore36.recipepantry.util.dto.error.payloads;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Payload class for displaying data validation error messages.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public class DataValidationErrorPayload extends ErrorPayload {

    private final List<String> validationErrors;

    /**
     * Creates an instance of the DataValidationErrorPayload class.
     * 
     * @param developerMessage the error message for the developer
     * @param userMessage      the error message for the user
     * @param validationErrors a list of data validation error messages
     */
    public DataValidationErrorPayload(String developerMessage, String userMessage,
            List<String> validationErrors) {
        super(developerMessage, userMessage);
        this.validationErrors = validationErrors;
    }

    /**
     * Gets the list of data validation error messages
     * 
     * @return the list of data validation error messages
     */
    public List<String> getValidationErrors() {
        return this.validationErrors;
    }

}
