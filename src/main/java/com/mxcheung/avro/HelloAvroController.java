package com.mxcheung.avro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAvroController {

	@RequestMapping("hello")
	public String sayHello() {
		return ("Hello, SpringBoot on avro");
	}
}