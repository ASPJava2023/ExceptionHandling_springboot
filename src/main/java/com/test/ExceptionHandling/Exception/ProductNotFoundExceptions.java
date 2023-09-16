package com.test.ExceptionHandling.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class ProductNotFoundExceptions extends RuntimeException{
	private static final long seriaVersionUID =1;

}
