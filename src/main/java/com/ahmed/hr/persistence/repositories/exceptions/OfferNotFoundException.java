package com.ahmed.hr.persistence.repositories.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OfferNotFoundException extends RuntimeException {

	public OfferNotFoundException(String message) {
		super(message);
	}

}
