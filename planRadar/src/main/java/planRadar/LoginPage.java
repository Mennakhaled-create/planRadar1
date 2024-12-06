package planRadar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver siginDriver;
	
	By clickCookiesBtn = By.cssSelector("button[title=\"Deny all cookies\"]");
	//By loginBtn = By.cssSelector(".site-header .header-menu .container.d-none .supporting-menu > ul > li:nth-child(4) > a");
	By loginBtn = By.cssSelector("a[href=\"https://planradar.com/login/\"]");
	
	By userName = By.id("email");
	By passWord = By.id("password");
	By loginsuccessBtn = By.cssSelector("button[position=\"edge\"]");
	
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.siginDriver = driver;
	}
	public void acceptCookies() {
		wait = new WebDriverWait(siginDriver, Duration.ofSeconds(10));
		WebElement clickCookiesBtnElement =  wait.until(ExpectedConditions.visibilityOfElementLocated(clickCookiesBtn));
		clickCookiesBtnElement.click();
	}
	public void clickLoginBtn() {
		wait = new WebDriverWait(siginDriver, Duration.ofSeconds(5));
		WebElement loginBtnElement =  wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
		loginBtnElement.click();
	}
	public void enterUsername(String text) {
		wait = new WebDriverWait(siginDriver, Duration.ofSeconds(5));
		WebElement userNameElement =  wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
		userNameElement.sendKeys(text);
	}
	public void enterPassword(String text) {
		wait = new WebDriverWait(siginDriver, Duration.ofSeconds(5));
		WebElement passWordElement =  wait.until(ExpectedConditions.visibilityOfElementLocated(passWord));
		passWordElement.sendKeys(text);
		
	}
	public void login() {
		wait = new WebDriverWait(siginDriver, Duration.ofSeconds(5));
		WebElement loginsuccessBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(loginsuccessBtn));
		loginsuccessBtnElement.click();
	}

}
