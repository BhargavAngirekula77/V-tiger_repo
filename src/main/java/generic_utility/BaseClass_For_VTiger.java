package generic_utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectClass.Login_out_POM_class;

public class BaseClass_For_VTiger {
	
	
	public static WebDriver driver=null;
	public Login_out_POM_class pop= new Login_out_POM_class(driver);
    public WebDriver_utility web_ut= new WebDriver_utility();
	public  DataBase_utility DbUtil= new DataBase_utility();
	
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnection() throws Exception {
		DbUtil.estiablishDBConnection();
		System.out.println("DB_Connection is estiablish");
		Reporter.log("DB_Connection is done");
	}
	
	@BeforeClass(alwaysRun = true)
	public  void launch_broswer() throws Exception {
		 Prop_Data pro= new Prop_Data();
		String URL= pro.getPro_Data("url");
	 
		driver= new EdgeDriver();
		web_ut.imp_wait(driver);
		web_ut.max_win(driver);
		driver.get(URL);
		
		System.out.println("broser launch done sucessfully");
		Reporter.log("broser launch done sucessfully");
		Thread.sleep(2000);
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws Exception {
		Login_out_POM_class pop= new Login_out_POM_class(driver);
	Prop_Data pro= new Prop_Data();
		String User= pro.getPro_Data("Username");
		String Pass= pro.getPro_Data("Password");
	
		pop.login_op(User, Pass);
		
		System.out.println("log_in done sucessfully");
		Reporter.log("log_in done sucessfully");
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void logOut() throws Exception {
	//	pop.logout_op();
		System.out.println("log_out done sucessfully");
		Reporter.log("log_out done sucessfully");
		
	}
	
	@AfterClass(alwaysRun = true)
	public void close_bros() {
		driver.close();
		System.out.println("driver closed done sucessfully");
		Reporter.log("driver closed done sucessfully");
		
	}
	@AfterSuite(alwaysRun = true)
	
	public void dbConnection_clse() throws Exception {
		DbUtil.closeConnection();
		System.out.println("dbConnection_clse done sucessfully");
		Reporter.log("dbConnection_clse done sucessfully");
		
		
	}


}
