package com.emoore36.recipepantry.util.dto.success;

import org.springframework.http.HttpStatus;

import com.emoore36.recipepantry.util.dto.DTO;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Abstract base class for DTOs of successful transactions.
 * 
 * @param <T> the type of data payload.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class SuccessDTO<T> extends DTO {

    private final T data;

    /**
     * An instance of the abstract SuccessDTO class. This DTO (and its extensions)
     * contains a data payload to send to the client.
     * 
     * @param status  The HTTP status of the DTO.
     * @param message The response message of the DTO.
     * @param data    the data payload to send.
     */
    protected SuccessDTO(HttpStatus status, String message, T data) {
        super(status, message);
        this.data = data;
    }

    /**
     * Gets the data payload.
     * 
     * @return the data payload.
     */
    public T getData() {
        return this.data;
    }

}
