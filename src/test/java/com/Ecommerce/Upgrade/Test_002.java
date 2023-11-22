package com.Ecommerce.Upgrade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_utility.Excel_util;
import generic_utility.Prop_Data;
import generic_utility.WebDriver_utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectClass.Login_out_POM_class;

public class Test_002 {
@Test
public  void script() throws Exception {
	Excel_util exc= new Excel_util();
	String fristname= exc.getExcelData("Leads", 2, 2);
	String lastname= exc.getExcelData("Leads", 2, 3);
	String company= exc.getExcelData("Leads", 2, 4);
	
	Prop_Data pro= new Prop_Data();
	String url= pro.getPro_Data("url");
	String name= pro.getPro_Data("Username");
	String pass= pro.getPro_Data("Password");

	
	WebDriver_utility web= new WebDriver_utility();
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new ChromeDriver();
	Login_out_POM_class log= new Login_out_POM_class(driver);

	web.imp_wait(driver);
	web.max_win(driver);
	
	driver.get(url);
	
	log.login_op(name, pass);
	
	driver.findElement(By.xpath("//a[text()=\"Leads\"]")).click();
	driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fristname);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
	driver.findElement(By.xpath("//input[@name='company']")).sendKeys(company);

	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
	System.out.println(fristname+lastname+company);
	
	
	
	
	
	
	
	
	
}
}
