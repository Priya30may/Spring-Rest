package com.SpringRestPincodeService;

import org.springframework.stereotype.Service;

import com.Restgetpincode.Pincode;

@Service
public interface ServicePin {

	public Pincode getDetails(int pincode);

}
