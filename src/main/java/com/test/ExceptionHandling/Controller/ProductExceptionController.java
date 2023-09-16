package com.test.ExceptionHandling.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.test.ExceptionHandling.Exception.ProductNotFoundExceptions;

@ControllerAdvice
public class ProductExceptionController {
	
@ExceptionHandler(value= ProductNotFoundExceptions.class)

public ResponseEntity<Object> exceptionMethod (ProductNotFoundExceptions exception){
	return new ResponseEntity<Object> ("Product  being searched is not found", HttpStatus.NOT_FOUND);
}


}
