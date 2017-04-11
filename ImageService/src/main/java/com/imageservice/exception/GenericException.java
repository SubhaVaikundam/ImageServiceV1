package com.imageservice.exception;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class GenericException implements ErrorController {

	
	@RequestMapping(value="/error",produces ="application/json")
	@ResponseBody
	public String error()
	{
		return "There seems to be a technical error Please try again later.";
	}
	
	@Override
	public String getErrorPath() {
		return "/error";
	}  
}
