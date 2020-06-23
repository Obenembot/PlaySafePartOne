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
	    
	    @RequestMapping(method = RequestMethod.GET, value = "/ctok/{celsius}")
	    public double ctok(@PathVariable (value = "celsius") double celsius){
	        return service.celsiusToKelvin(celsius);
	    }
	    
	    @RequestMapping(method = RequestMethod.GET, value = "/mtok/{miles}")
	    public double mtok(@PathVariable double miles){
	        return service.milesToKilometer(miles);
	    }
	    
	    @RequestMapping(method = RequestMethod.GET, value = "/ktom/{kilometer}")
	    public double ktom(@PathVariable Double  kilometer){
	        return service.kilometerToMiles(kilometer);
	    }
}
