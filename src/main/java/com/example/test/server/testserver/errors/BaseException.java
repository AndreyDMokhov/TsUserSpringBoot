package com.example.test.server.testserver.errors;

import org.springframework.http.HttpStatus;

public class BaseException extends RuntimeException{

	  private static final String DEFAULT_MESSAGE = "Message not provided";
	    private static final HttpStatus DEFAULT_HTTP_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;

	    private String message;


	    public BaseException(String message) {
	        super(message);
	        this.message = message;
	    }

	    public HttpStatus getHttpStatus() {
	        return DEFAULT_HTTP_STATUS;
	    }

	    @Override
	    public String getMessage() {
	        return message == null ? DEFAULT_MESSAGE : message;
	    }
}
