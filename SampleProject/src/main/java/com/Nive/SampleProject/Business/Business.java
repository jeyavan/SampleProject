package com.Nive.SampleProject.Business;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Nive.SampleProject.DataService.DataService;

@Component
public class Business {
@Autowired	
private DataService dataservice;	
public String[][] display() {
return dataservice.string();
}
}
