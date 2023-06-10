package com.Nive.SampleProject.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nive.SampleProject.Business.Business;

@RestController
public class Controller {
@Autowired	
private Business business;	
@GetMapping("/d")
public String[][] display() {
return business.display();
}
//@GetMapping("/s")
public int sum() {
	return 10;
}
}
