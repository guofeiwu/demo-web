package com.example.web.controller;

public class MyRestResponse {

	private String message;

	public MyRestResponse(String message) {
        this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

}