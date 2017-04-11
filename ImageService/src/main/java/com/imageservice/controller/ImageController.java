package com.imageservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.imageservice.exception.ImageNotFound;
import com.imageservice.bean.ImageBean;
import com.imageservice.service.ImageService;


@RestController
public class ImageController {

	@Autowired
	private ImageService service;

	@RequestMapping(value = "/")
	public String home() {
		return "Product media service is accessible";
	}

	@RequestMapping(method = RequestMethod.GET,value = "/api/getimage/{id}",produces ="application/json")	
	public ImageBean getProductImageURL(@PathVariable("id") String catId) throws ImageNotFound {
		ImageBean bean=service.findByCatId(catId);
		if(bean==null)
		{
			throw new ImageNotFound();
		}
		return bean;
	}
	

	@ExceptionHandler(ImageNotFound.class)
	public String itemNotFound() throws JsonProcessingException
	{
		return "Requested Product Media is not found";
	}
	
}
