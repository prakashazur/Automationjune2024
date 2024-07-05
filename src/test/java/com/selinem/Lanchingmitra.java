package com.selinem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lanchingmitra {
static WebDriver driver;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		  //this is used for testing purpose when there is locking system
		 
        driver= new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("desktop-searchBar")).sendKeys(" mobile");
       // driver.findElement(By.className("desktop-submit")).click();
        driver.findElement(By.id("dropdown"));
        driver.findElement(By.id("#deta-index=5")).click();
	}

}
