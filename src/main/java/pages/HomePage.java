package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[normalize-space(text()='Log in')])[6]") // Here Need CHANGES!!!!
	WebElement logInButton;

	public void clickLogInButton() throws InterruptedException {
		logInButton.click();
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//a[@class='logo']")
	WebElement logo;

	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The Logo is Displayed? Ans: " + flag);
		return flag;
	}

}
