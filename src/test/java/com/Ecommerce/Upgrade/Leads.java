package com.Ecommerce.Upgrade;

import generic_utility.BaseClass_For_VTiger;
import objectClass.HomePage_POM;

public class Leads extends BaseClass_For_VTiger {
	HomePage_POM hom= new HomePage_POM(driver);
	public void script() {
		hom.clickLeads();
	}

}
