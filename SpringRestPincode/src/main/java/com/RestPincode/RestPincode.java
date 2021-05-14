package com.RestPincode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Restgetpincode.Pincode;
import com.SpringRestPincodeService.ServicePin;

@RestController
public class RestPincode {
	
	@Autowired
	ServicePin z;

	@GetMapping("/find/{pincode}")
	public Pincode get(@PathVariable int pincode) {
		System.out.println(pincode);
		return z.getDetails(pincode);	
	}
}
