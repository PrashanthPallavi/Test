package TestNG;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class P7 extends basetest{
    @Test
    public void acti()		
    {

    	driver.get("https://demo.actitime.com/login.do");
    	driver.findElement(By.id("username")).sendKeys("admin");
    	driver.findElement(By.name("pwd")).sendKeys("manager");
    	driver.findElement(By.id("loginButton")).click();
    driver.findElement(By.xpath("//a[@class='content users']")).click();
    
   }
	}



