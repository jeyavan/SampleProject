package com.Nive.SampleProject.Interface;

import org.springframework.stereotype.Component;

@Component
public class Calculator2 {
	public void sub() {
		double a=50.2;
		double b=60.5;
		System.out.println("Sub: "+(a-b));
	}

}
