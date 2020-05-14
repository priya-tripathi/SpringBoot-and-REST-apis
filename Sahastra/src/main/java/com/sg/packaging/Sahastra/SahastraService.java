package com.sg.packaging.Sahastra;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SahastraService {
	@RequestMapping("/")
	public String indexHello() {
		return ("hello priya");
		
	}
}
