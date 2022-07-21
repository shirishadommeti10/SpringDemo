package com.shirisha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shirisha.dto.OrderDto;
import com.shirisha.service.OrderService;

 @RestController
 @RequestMapping("/order")
 public class OrderController {
	@Autowired
OrderService oservice;
	@Autowired
	Environment environment;
	@PostMapping("/book")
	public ResponseEntity<String> addData(@RequestBody OrderDto odto)
	{
		oservice.addData(odto);
		String msg=environment.getProperty("API.SUCCESS");
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
 }