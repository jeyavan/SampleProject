package com.Nive.SampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.Nive.SampleProject.Interface.Calculator;

import Practice.HomeA;


@SpringBootApplication
@ComponentScan({"com.Nive.SampleProject","Practice","com.Nive.SampleProject.Interface"})
public class SampleProjectApplication {
public static void main(String[] args) {
	
		ConfigurableApplicationContext context = 
		SpringApplication.run(SampleProjectApplication.class, args);
		//instead of object create(Home h=new home();).you can use this bean method 
      Home h=context.getBean(Home.class);                //create the home object using with bean method
		h.connect();
	
		Home h2=context.getBean(Home.class);                //create the home object using with bean method
		h2.connect();
	
		HomeA homea=context.getBean(HomeA.class);
		homea.connection(); 
		
		Calculator cal=context.getBean(Calculator.class);
		cal.display();
		
 }

}
