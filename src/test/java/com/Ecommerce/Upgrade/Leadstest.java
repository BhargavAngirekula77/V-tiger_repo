package com.Ecommerce.Upgrade;

import org.testng.annotations.Test;

import generic_utility.BaseClass_For_VTiger;
import objectClass.HomePage_POM;

public class Leadstest extends BaseClass_For_VTiger {
	@Test
	public void script() {
		HomePage_POM hom= new HomePage_POM(driver);
		hom.clickLeads();
	}

}
