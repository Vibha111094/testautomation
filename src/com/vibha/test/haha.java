package com.vibha.test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class haha {

	@Test
	public static  void test() throws IOException, InterruptedException {
		int a=0;
		 WebDriver driver;
		  String baseUrl;
		  boolean acceptNextAlert = true;
		  StringBuffer verificationErrors = new StringBuffer();
		  driver = new FirefoxDriver();
		    baseUrl = "https://cloudsimba.com";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    try{
		    driver.get(baseUrl + "/");
		    driver.findElement(By.id("loginbtn")).click();
		    driver.findElement(By.id("emaillogin")).sendKeys("abc@gmail.com");
		    driver.findElement(By.id("passwordlogin")).sendKeys("Welcome@12345");
		    driver.findElement(By.id("logbtn")).click();
		    Thread.sleep(10000);
		    
		    
		    driver.findElement(By.id("plantype"));
		    }catch (Exception e)
		     {
		    	a=1;
		    	System.out.println("login not  possible");
		    	}
		    if(a==0)
		    {
		    	System.out.println("login not  possible");
		    }
			
	}
}

		


