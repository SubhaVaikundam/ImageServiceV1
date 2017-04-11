package com.imageservice.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="buyMartImageService")
public class ImageBean {

	@Id
	private String id;
	private List<String> imageURLs;
	private String catentryid;
	
	
	public String getCatentryid() {
		return catentryid;
	}
	public void setCatentryid(String catentryid) {
		this.catentryid = catentryid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getImageURLs() {
		return imageURLs;
	}
	public void setImageURLs(List<String> imageUrls) {
		this.imageURLs = imageUrls;
	}
	
	
	
	
}
