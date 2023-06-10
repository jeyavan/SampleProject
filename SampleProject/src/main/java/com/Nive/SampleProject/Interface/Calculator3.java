package com.Nive.SampleProject.Interface;

import org.springframework.stereotype.Component;

@Component
public class Calculator3 {
	public void mul() {
		double a=10.9;
		double b=50.8;
		System.out.println("Mul: "+(a*b));
	}

}
