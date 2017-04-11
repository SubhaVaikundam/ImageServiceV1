package com.imageservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageservice.bean.ImageBean;

public interface ImageRepository extends MongoRepository<ImageBean, String>{

	public ImageBean findByid(String catid);  
	
}
