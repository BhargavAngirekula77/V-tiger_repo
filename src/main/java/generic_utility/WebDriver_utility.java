package generic_utility;

import static org.testng.Assert.expectThrows;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriver_utility {
	
//	public static Actions act= new Actions(BaseClass_For_VTiger.driver);
	public Alert al=null;
	

	public void max_win(WebDriver driver) {
		driver.manage().window().maximize();	
	}
	
	public void imp_wait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void explicite_waitfor_any_Element(WebDriver driver,WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public void expliciteWait_element_clickable(WebDriver driver,WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public String getScreenShot(String name) throws Exception {
		TakesScreenshot shot=  (TakesScreenshot)BaseClass_For_VTiger.driver;
		File scr= shot.getScreenshotAs(OutputType.FILE);
		File desc= new File("./Screenshots/",name+".png");
		String Final_path=desc.getAbsolutePath();
		Files.copy(scr, desc);
		return Final_path;

		
	}
	
	
	public void switchWindow(WebDriver driver) {
		String parentId= driver.getWindowHandle();
		Set<String> child=  driver.getWindowHandles();
		  Iterator lol= child.iterator();
		  while (lol.hasNext()) {
			  String chil= ((WebElement)lol.next()).getText();
			  if(!parentId.equals(lol)) {
				  
				  driver.switchTo().window(chil);
			  }
			
		}
	}
	
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
		
	}
	
	public void getAlert(WebDriver driver) {
		 al= driver.switchTo().alert();
		
	}
	
	public void acceptAlert() {
		al.accept();
	}
	
	public void dismiss() {
		al.dismiss();
	}
	
	public String getAlertText() {
		String data= al.getText();
		return data;
	}
	
	
}
