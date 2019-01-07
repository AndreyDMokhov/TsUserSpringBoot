package com.example.test.server.testserver.handlers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import com.example.test.server.testserver.entity.dto.ErrorResponse;
import com.example.test.server.testserver.errors.BaseException;

@ControllerAdvice
public class ErrorHandlerAdvice {
	
	@ExceptionHandler(BaseException.class)
    public ResponseEntity<ErrorResponse> getBaseResponse(BaseException e) {
        ErrorResponse errorResponse = ErrorResponse
                .builder()
                .message(e.getMessage())
                .build();

        return new ResponseEntity<>(errorResponse, e.getHttpStatus());
    }

}
