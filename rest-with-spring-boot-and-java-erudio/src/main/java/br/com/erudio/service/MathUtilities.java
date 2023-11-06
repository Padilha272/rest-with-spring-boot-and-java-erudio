package br.com.erudio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathUtilities {
	
	@Autowired
	private NumberConverter number;

	public Double soma(String num1,String num2) {
		return number.convertToDouble(num1)+number.convertToDouble(num2);
	}
	
	public Double sub(String num1,String num2) {
		return number.convertToDouble(num1)-number.convertToDouble(num2);
	}
	
	public Double mult(String num1,String num2) {
		return number.convertToDouble(num1)*number.convertToDouble(num2);
	}
	
	public Double mean(String num1,String num2) {
		return (number.convertToDouble(num1)/number.convertToDouble(num2))/2;
	}
	public Double sqrt(String num) {
		return Math.sqrt(number.convertToDouble(num));
	}
	

	

	
}
