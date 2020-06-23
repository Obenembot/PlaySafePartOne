package za.co.playsafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import za.co.playsafe.services.ConversionServices;

@RestController
@CrossOrigin(origins = "*")
public class ConversionController {

	@Autowired
	ConversionServices service;
	

	 @RequestMapping(method = RequestMethod.GET, value ="/ktoc/{kelvin}")
	    public double ktoc(@PathVariable double  kelvin){
	        return service.kelvinToCelsius(kelvin);
	    }
	    
	 
}
