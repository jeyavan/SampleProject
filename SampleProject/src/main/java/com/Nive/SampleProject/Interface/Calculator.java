package com.Nive.SampleProject.Interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator implements MathCalculator {
	@Autowired
	private Calculator2 cal2;
	@Autowired
	private Calculator3 cal3;
	public void display() {
		double a=30.2;
		double b=20.5;
		System.out.println("ADD: "+(a+b));
		cal2.sub();
		cal3.mul();
	}

}
