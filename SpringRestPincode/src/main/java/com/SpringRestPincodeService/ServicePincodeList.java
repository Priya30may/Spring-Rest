package com.SpringRestPincodeService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Restgetpincode.Pincode;
@Service
public class ServicePincodeList implements ServicePin {
	
	List<Pincode> pin;

	public ServicePincodeList() {
		pin = new ArrayList<>();
		pin.add(new Pincode(600063,"TN","Perungalathur","India"));
		pin.add(new Pincode(600122,"TN","Chengalpet","India"));
		pin.add(new Pincode(600123,"TN","Chrompet","India"));
		pin.add(new Pincode(600100,"TN","Shollinganallur","India"));
		pin.add(new Pincode(263108,"UK","Dehradun","India"));
		pin.add(new Pincode(145000,"Delhi","Adayar","India"));
		pin.add(new Pincode(118866,"MP","Patel Nagar","India"));
		pin.add(new Pincode(113149,"MH","Pune","India"));
		pin.add(new Pincode(269949,"RJ","Jaipur","India"));
		pin.add(new Pincode(999149,"MP","Bhopal","India"));
		pin.add(new Pincode(123456,"Delhi","Annanagar","India"));		
	}
	
	public Pincode getDetails(int pincode) {
		for(Pincode p : pin)
			{
			if(p.getPin()==pincode)
				{
				System.out.println(p);
			    return p;
			    }
			}
		return null;
		
	}
	
	
	

}
