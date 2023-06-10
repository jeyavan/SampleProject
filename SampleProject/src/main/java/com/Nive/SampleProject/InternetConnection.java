package com.Nive.SampleProject;

import org.springframework.stereotype.Component;

@Component("III")
public class InternetConnection {
	private String ipAdress;
	private int speed;
	
	public String getIpAdress() {
		return ipAdress;
	}
	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void switchOn() {
	System.out.println("Switching on internet");
	
	}
	

}
