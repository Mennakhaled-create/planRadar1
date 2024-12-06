package planRadar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class createFormTestCases {
	
	LoginPage loginDriver;
	chooseCreateForm chooseCreateFormDriver;
	CreateForm createFormDriver;
	
	WebDriver driver;
	
  @Test
  public void createForm() {
	  loginDriver.acceptCookies();
	  loginDriver.clickLoginBtn();
	  loginDriver.enterUsername("ENTER YOUR EMAIL ADDRESS");
	  loginDriver.login();
	  loginDriver.enterPassword("ENTER YOUR PASSWORD");
	  loginDriver.login();
	  chooseCreateFormDriver.clickCollapseBtn();
	  chooseCreateFormDriver.clickformAndListBtn();
	  chooseCreateFormDriver.clickCreateFormBtn();
	  createFormDriver.setFormName("Menna Form");
	  createFormDriver.setTitleFieldData("description title");
	  createFormDriver.setShortTextFieldData("description short text");
	  createFormDriver.setCheckBoxFieldData();
	  createFormDriver.setTimeFieldData("259p");
	  createFormDriver.setDateField();
	  createFormDriver.setListField("Trade");
	  createFormDriver.setProgressField("50");
	  createFormDriver.saveDataForm();
	  
	  boolean isSaveButtonEnabled = createFormDriver.createSuccessfullyForm();
	  Assert.assertFalse("The Form is Created!", isSaveButtonEnabled);
  }
  
@BeforeMethod
public void open() {
	  System.setProperty("webdriver.chrome driver", System.getProperty("user.dir")+"D:\\Eclipse_Projects\\eclipse-workspace\\planRadar\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.planradar.com/");
	  
	  loginDriver = new LoginPage(driver);
	  chooseCreateFormDriver = new chooseCreateForm(driver);
	  createFormDriver = new CreateForm(driver);
}

 @AfterMethod
 public void close() {
	driver.close();
 }

}
