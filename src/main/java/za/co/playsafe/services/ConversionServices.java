package za.co.playsafe.services;

import org.springframework.stereotype.Service;

@Service
public class ConversionServices {

	// Kelvin to celsius
	public double kelvinToCelsius(double kelvin) {

		double celsius = kelvin - 273.15;

		return celsius;
	}

	// celsius to kelvin
	public double celSiusToKelvin(double celsius) {

		double kelvin = celsius + 273.15;

		return kelvin;
	}

	// miles to kilometers
	public double milesToKilometer(double miles) {

		double kilometer = miles / 0.6214;

		return kilometer;
	}

	// kilometers to miles
	public double kilometerToMiles(double kilometer) {

		double miles = kilometer * 0.6214;

		return miles;
	}
}
