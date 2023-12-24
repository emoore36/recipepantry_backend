package com.emoore36.recipepantry.util.dto.success;

import org.springframework.http.HttpStatus;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * DTO for a successful response containing a single instance payload. Used
 * to return a single instance retrieved from a given unique identifier.
 *
 * @param <T> Type of the single-instance data payload.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public class SingleSuccessDTO<T> extends SuccessDTO<T> {

    /**
     * An instance of the SingleSuccessDTO.
     * 
     * @param status  the HTTP status of the DTO
     * @param message the response message of the DTO
     * @param data    the single instance data payload
     */
    public SingleSuccessDTO(HttpStatus status, String message, T data) {
        super(status, message, data);
    }

}
