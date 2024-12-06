package planRadar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CreateForm {
	
	WebDriver createFormDriver;
	
	By enterformName = By.cssSelector(".flex-auto .form-content-container .max-w-screen-xl > div > div.flex > div.form-text-input > div:nth-child(2) > div > div > input");
	
	By clickTitleField = By.cssSelector(".ReactVirtualized__Grid__innerScrollContainer > div > div > div.absolute");
	By enterTitleDesc = By.cssSelector("textarea[data-id=\"Setup_Forms_title_Description\"]");
	
	By clickShortTextField = By.cssSelector("div[data-id=\"setup_forms_shorttext\"] > div.absolute");
	By enterShortTextDesc = By.cssSelector("textarea[data-id=\"Setup_Forms_shorttext_Description\"]");
	
	By clickCheckBoxField = By.cssSelector("div[data-id=\"setup_forms_checkbox\"] > div.absolute");
	By clickCheckBoxMandatory = By.cssSelector("input[name=\"checkbox input\"]");
	
	By clickTimeField = By.cssSelector("div[data-id=\"setup_forms_time\"] > div.absolute");
	By clickAndEnterTimeDefaultVal = By.cssSelector("input[data-id=\"Setup_Forms_Time_DefaultValue\"]");
	
	By clickDateField = By.cssSelector("div[data-id=\"setup_forms_date\"] > div.absolute");
	By clickDateDefaultVal = By.cssSelector("span[data-testid=\"date-input\"]");
	By chooseDate = By.cssSelector(".react-datepicker__day--today");
	
	By clickListField = By.cssSelector("div[data-id=\"setup_forms_lists\"] > div.absolute");
	By clickListDropDown = By.cssSelector("div[id=\"react-select-2-placeholder\"]");
	By enterListVal = By.cssSelector("input[id=\"react-select-2-input\"]");
	
	By clickProgressField = By.cssSelector("div[data-id=\"setup_forms_progress\"] > div.absolute");
	By selectProgressVal = By.cssSelector("input[data-id=\"Setup_Forms_Progress_DefaultValue\"]");
	
	By clickSaveBtn = By.cssSelector("button[data-id=\"setup_forms_save\"]");
	
	WebDriverWait wait;
	
	public CreateForm(WebDriver driver) {
		this.createFormDriver = driver;
		
	}
	public void setFormName(String text) {
		wait = new WebDriverWait(createFormDriver, Duration.ofSeconds(5));
		WebElement formNamElement = wait.until(ExpectedConditions.visibilityOfElementLocated(enterformName));
		formNamElement.sendKeys(text);
	}
	public void setTitleFieldData(String text) {
		wait = new WebDriverWait(createFormDriver, Duration.ofSeconds(5));
		WebElement clickTitleFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickTitleField));
		clickTitleFieldElement.click();
		
		WebElement enterTitleDescElement = wait.until(ExpectedConditions.visibilityOfElementLocated(enterTitleDesc));
		enterTitleDescElement.sendKeys(text);
	}
	public void setShortTextFieldData(String text) {
		wait = new WebDriverWait(createFormDriver, Duration.ofSeconds(5));
		WebElement clickShortTextFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickShortTextField));
		clickShortTextFieldElement.click();
		
		WebElement enterShortTextDescElement = wait.until(ExpectedConditions.visibilityOfElementLocated(enterShortTextDesc));
		enterShortTextDescElement.sendKeys(text);
	}
	public void setCheckBoxFieldData() {
		wait = new WebDriverWait(createFormDriver, Duration.ofSeconds(5));
		WebElement clickCheckBoxFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickCheckBoxField));
		clickCheckBoxFieldElement.click();
		
		WebElement clickCheckBoxMandatoryElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickCheckBoxMandatory));
		clickCheckBoxMandatoryElement.click();
	}
	public void setTimeFieldData(String text) {
		wait = new WebDriverWait(createFormDriver, Duration.ofSeconds(5));
		WebElement clickTimeFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickTimeField));
		clickTimeFieldElement.click();
		
		WebElement clickAndEnterTimeDefaultValElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickAndEnterTimeDefaultVal));
		clickAndEnterTimeDefaultValElement.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickAndEnterTimeDefaultVal));
		clickAndEnterTimeDefaultValElement.sendKeys(text);
	}
	public void setDateField() {
		wait = new WebDriverWait(createFormDriver, Duration.ofSeconds(5));
		WebElement clickDateFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickDateField));
		clickDateFieldElement.click();
		
		WebElement clickDateDefaultValElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickDateDefaultVal));
		clickDateDefaultValElement.click();
		
		WebElement chooseDateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(chooseDate));
		chooseDateElement.click();
		
	}
	public void setListField(String text) {
		wait = new WebDriverWait(createFormDriver, Duration.ofSeconds(5));
		WebElement clickListFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickListField));
		clickListFieldElement.click();
		
		WebElement clickListDropDownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickListDropDown));
		clickListDropDownElement.click();
		
		WebElement enterListValElement = wait.until(ExpectedConditions.visibilityOfElementLocated(enterListVal));
		enterListValElement.sendKeys(text + Keys.ENTER);
	}
	public void setProgressField(String text) {
		wait = new WebDriverWait(createFormDriver, Duration.ofSeconds(5));
		WebElement clickProgressFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickProgressField));
		clickProgressFieldElement.click();
		
		WebElement selectProgressValElement = wait.until(ExpectedConditions.visibilityOfElementLocated(selectProgressVal));
		Actions actions = new Actions(createFormDriver);
		actions.clickAndHold(selectProgressValElement)
		       .moveByOffset(20, 0)  // Change offset as needed
		       .release()
		       .perform();

	}
	public void saveDataForm() {
		wait = new WebDriverWait(createFormDriver, Duration.ofSeconds(5));
		WebElement clickSaveBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickSaveBtn));
		clickSaveBtnElement.click();
	}
	public boolean createSuccessfullyForm() {
		wait = new WebDriverWait(createFormDriver, Duration.ofSeconds(5));
		WebElement clickSaveBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(clickSaveBtn));
		
		boolean isButtonEnabled = clickSaveBtnElement.isEnabled();
		return(isButtonEnabled);
	
	}

}
