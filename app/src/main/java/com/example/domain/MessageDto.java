package com.example.domain;

import java.io.Serializable;

public class MessageDto implements Serializable {
	private String author;

	public MessageDto(){
	}

	public MessageDto(String author, String message) {
		this.author = author;
		this.message = message;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
}