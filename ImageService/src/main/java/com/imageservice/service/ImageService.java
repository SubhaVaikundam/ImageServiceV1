package com.imageservice.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.imageservice.bean.ImageBean;
import com.imageservice.repository.ImageRepository;

@Service
public class ImageService {

	@Autowired
	ImageRepository repository;
	@Autowired
	private MongoOperations operation;
	private Logger logger= LoggerFactory.getLogger(ImageService.class);

	public ImageBean findByCatId(String productId){
		ImageBean ImageBean=(ImageBean)repository.findByid(productId);
		if(ImageBean!=null){
			logger.debug("Retrieved Media Item is: "+ImageBean.toString());
			return ImageBean;
		}
		return null;
	}	
}
