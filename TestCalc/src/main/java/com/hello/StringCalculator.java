package com.hello;

public class StringCalculator {
	
	/*public static void main(String[] args) {
		System.out.println("Hello");
		String number="1,2,4";
		add(number);
	}
	*/
	
	public static final void add(final String numbers) {
		String[] numbersArray = numbers.split(",");
		boolean ValidationFailed=false;
		
		ValidationFailed=isNumberLengthGreaterThanTwo(numbersArray);
		if(ValidationFailed)
			throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
		
		ValidationFailed= isNumberEmpty(numbersArray);
		if(ValidationFailed)
			throw new RuntimeException("number cant be empty");
		int sum=0;
		for (String number : numbersArray) {
			sum+= Integer.parseInt(number);
		}
		System.out.println("Sum of numbers is:"+sum);
		
		
	}


	public static boolean isNumberLengthGreaterThanTwo(String[] numbersArray) {
		if (numbersArray.length > 2) 
            return true;
		else
			return false;
	
	}
	public static boolean isNumberEmpty(String[] numbersArray) {
		for (String number : numbersArray) {
            if (number.isEmpty()) 
                return true;
            	break;
		}
		return false;
	}
}
