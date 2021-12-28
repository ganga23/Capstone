package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
	WebDriver driver;

	public SignUp(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void SignUp() {

		driver.findElement(By.xpath("//a[text()='Login/Signup']")).click();
		System.out.println("user has opened login page");
		driver.findElement(By.xpath("//a[text()='Not a member? Signup']")).click();
		System.out.println("user opts to register");
		driver.findElement(By.name("email_id")).sendKeys("ganga@domain.com");
		driver.findElement(By.name("pwd")).sendKeys("ganga");
		driver.findElement(By.name("pwd2")).sendKeys("ganga");
		driver.findElement(By.name("name")).sendKeys("ganga");
		System.out.println("user enters details required");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		driver.findElement(By.xpath("//a[text()='Already a member? Login']")).click();
		System.out.println("user registered successfully");


	}
}
