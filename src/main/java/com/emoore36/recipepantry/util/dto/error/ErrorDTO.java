package com.emoore36.recipepantry.util.dto.error;

import org.springframework.http.HttpStatus;

import com.emoore36.recipepantry.util.dto.DTO;
import com.emoore36.recipepantry.util.dto.error.payloads.ErrorPayload;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Data Transfer Object (DTO) for representing an error response with an
 * associated error payload.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public class ErrorDTO extends DTO {

    private final ErrorPayload errorPayload;

    /**
     * An instance of the ErrorDTO class.
     * 
     * @param httpStatus      the HTTP status of the DTO.
     * @param responseMessage the response message of the DTO.
     * @param errorPayload    the error payload
     */
    public ErrorDTO(HttpStatus httpStatus, String responseMessage, ErrorPayload errorPayload) {
        super(httpStatus, responseMessage);
        this.errorPayload = errorPayload;
    }

    /**
     * Gets the error payload
     * 
     * @return the error payload
     */
    public ErrorPayload getErrorPayload() {
        return this.errorPayload;
    }

}
