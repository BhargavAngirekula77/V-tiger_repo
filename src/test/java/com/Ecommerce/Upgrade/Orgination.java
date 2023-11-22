package com.Ecommerce.Upgrade;

import org.testng.annotations.Test;

import generic_utility.BaseClass_For_VTiger;
import objectClass.HomePage_POM;

public class Orgination extends BaseClass_For_VTiger {
	@Test
	public void script() {
		HomePage_POM ho= new HomePage_POM(driver);
		ho.clickOrganizations();
	}

}
