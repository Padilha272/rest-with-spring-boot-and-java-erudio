package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.service.MathUtilities;
import br.com.erudio.service.NumberConverter;

@RestController
public class MathController {
	

	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	 private MathUtilities utility;
	
	@Autowired
	private NumberConverter number;
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value="numberOne")String numberOne,
			@PathVariable(value="numberTwo")String numberTwo
			)throws Exception{
		if(!number.isNumeric(numberOne)||!number.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!"); 
		}
		return utility.soma(numberOne, numberTwo);
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double sub(
			@PathVariable(value="numberOne")String numberOne,
			@PathVariable(value="numberTwo")String numberTwo
			)throws Exception{
		if(!number.isNumeric(numberOne)||!number.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!"); 
		}
		return utility.sub(numberOne, numberTwo);
		
	}
	
	@RequestMapping(value="/mult/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double mult(
			@PathVariable(value="numberOne")String numberOne,
			@PathVariable(value="numberTwo")String numberTwo
			
			)throws Exception {
		if(!number.isNumeric(numberOne)||!number.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!"); 
		}
		return utility.mult(numberOne, numberTwo);
	}
	
	@RequestMapping(value="/mean/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double mean(
			@PathVariable(value="numberOne")String numberOne,
			@PathVariable(value="numberTwo")String numberTwo
			
			)throws Exception {
		if(!number.isNumeric(numberOne)||!number.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!"); 
		}
		return utility.mean(numberOne, numberTwo);
	}
	
	@RequestMapping(value="/sqrt/{numberOne}",
			method=RequestMethod.GET)
	public Double sqrt(
			@PathVariable(value="numberOne")String numberOne					
			)throws Exception {
		if(!number.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!"); 
		}
		return utility.sqrt(numberOne);
	}
	
	
	
	

	
	
	
} 
