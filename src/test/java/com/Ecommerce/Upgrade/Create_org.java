package com.Ecommerce.Upgrade;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import generic_utility.BaseClass_For_VTiger;
import generic_utility.Excel_util;
import objectClass.HomePage_POM;
import objectClass.OrganizationsAddPage_POM;
import objectClass.OrginzationHomePage_POM;


public class Create_org extends BaseClass_For_VTiger {
	@Test
	public void script() throws Exception {
		OrginzationHomePage_POM org=new OrginzationHomePage_POM(driver);
		OrganizationsAddPage_POM orgAdd= new OrganizationsAddPage_POM(driver);
		HomePage_POM hom= new HomePage_POM(driver);
		hom.clickOrganizations();
		org.clickOnAdd();
		Excel_util ex= new Excel_util();
		String org_name=ex.getExcelData("Organizations", 2, 1);
		orgAdd.clickOnName(org_name);
		
		orgAdd.clickOnSaveButton();
		
	}

	

}
