package planRadar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class chooseCreateForm {
	
	WebDriver chooseDriver;
	
	By CollapseBtn = By.cssSelector(".main-menu > div > div:nth-child(3) > div > svg");
	By formAndListBtn = By.cssSelector(".sidebar-items-container > div:nth-child(8) > div > div:nth-child(2)");
	By FormBtn = By.cssSelector(".sidebar-hover-overlay > div > a:nth-child(1)");
	By CreateFormBtn = By.cssSelector("button[data-id=\"Setup_Forms_CreateNewForm\"]");
	
	WebDriverWait wait;
	
	public chooseCreateForm(WebDriver driver) {
		this.chooseDriver = driver;
	}
	public void clickCollapseBtn() {
		wait = new WebDriverWait(chooseDriver, Duration.ofSeconds(5));
		WebElement collapseBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(CollapseBtn));
		collapseBtnElement.click();
	}
	public void clickformAndListBtn() {
		Actions actions = new Actions(chooseDriver);
		wait = new WebDriverWait(chooseDriver, Duration.ofSeconds(5));
		WebElement formAndListBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(formAndListBtn));
		actions.moveToElement(formAndListBtnElement).perform();
		//formAndListBtnElement.click();
		wait = new WebDriverWait(chooseDriver, Duration.ofSeconds(5));
		WebElement FormBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(FormBtn));
		FormBtnElement.click();
	}
	public void clickCreateFormBtn() {
		wait = new WebDriverWait(chooseDriver, Duration.ofSeconds(5));
		WebElement createFormBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(CreateFormBtn));
		createFormBtnElement.click();
	}

}
