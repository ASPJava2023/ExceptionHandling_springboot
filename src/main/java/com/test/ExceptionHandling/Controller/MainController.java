package com.test.ExceptionHandling.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.ExceptionHandling.Exception.ProductNotFoundExceptions;

@RestController
public class MainController {
	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)

	@ResponseBody
	public String getProduct(@PathVariable("id") String id) {

		int val = Integer.parseInt(id);
		if (val <= 0) {
			throw new ProductNotFoundExceptions();
		} else {
			return "its found";
		}
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String MainProductPage() {
		return " it is main page";
	}
}
