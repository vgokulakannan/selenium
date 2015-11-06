package com.demo.jenkins;
import org.openqa.grid.selenium.*;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.annotations.Test;
import java.util.*;
@Test
public class RegistrationTest {

 //This is TestNG annotation

public void testRegister(){

	
WebDriver driver = new FirefoxDriver();


driver.get("http://localhost:8080/HelloWorld/HelloWorld/WebContent/");
driver.manage().window().maximize();
driver.findElement(By.id("num1")).clear();
driver.findElement(By.id("num1")).sendKeys("4");
driver.findElement(By.id("num2")).clear();
driver.findElement(By.id("num2")).sendKeys("4");
driver.findElement(By.id("add")).click();

driver.close();


}

}