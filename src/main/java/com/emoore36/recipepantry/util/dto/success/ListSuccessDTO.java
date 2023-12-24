package com.emoore36.recipepantry.util.dto.success;

import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Data Transfer Object (DTO) for a successful response with a payload
 * containing a list of instances.
 *
 * @param <T> Type of the data for the list payload.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public class ListSuccessDTO<T> extends SuccessDTO<List<T>> {

    private final List<T> data;

    /**
     * An instance of the ListSuccessDTO class.
     * 
     * @param status        the HTTP status of the DTO
     * @param message       the response message of the DTO
     * @param instancesList the single-type bulk data payload
     */
    public ListSuccessDTO(HttpStatus status, String message, List<T> instancesList) {
        super(status, message, instancesList);
        this.data = instancesList;
    }

    /**
     * Gets the single-type bulk data payload.
     * 
     * @return the single-type bulk data payload.
     */
    public List<T> getData() {
        return this.data;
    }

}
