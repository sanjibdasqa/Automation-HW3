package testPages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseUtil.BaseClass;
import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class HomepageTest extends BaseClass {

	@Test(enabled = true, priority = 1)
	public void clickLogInButton01Test() throws InterruptedException {
		homePage.clickLogInButton();
	}

	@Test(enabled = false, priority = 2)
	public void clickWatchVideo() {
		driver.findElement(By.cssSelector("a#tcom-home-bhp-half-promo-left")).click();
	}

	@Test(enabled = false, priority = 3)
	public void clickPersonalInsurance() {
		driver.findElement(By.cssSelector("a.btn.btn-primary.cta[id='tcom-home-pi-sectionheader']")).click();
	}

	@Test(enabled = false, priority = 4)
	public void click_retrieve_a_new_quote() throws InterruptedException {
		driver.findElement(By.cssSelector("a[style='text-decoration: underline;']")).click();
		Thread.sleep(2000);

	}

	@Test(enabled = false, priority = 5)
	public void logotest() {
		homePage.logoDisplayed();
	}

	@Test(enabled = false, priority = 6)
	public void logo_test_by_Css_Selector() {
		driver.findElement(By.cssSelector("a.logo")).click();
	}

	@Test(enabled = false, priority = 7)
	public void login_button_is_enable_by_Css_Selector() {
		boolean loginButtonEnabled = driver.findElement(By.cssSelector("button.login-btn")).isEnabled();
		System.out.println("Is Login Button Enabled? Ans: " + loginButtonEnabled);

	}

	@Test(enabled = false, priority = 8)
	public void use_of_selected_in_check_box() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='hdr-login-btn']")).click();
		Thread.sleep(3000);
		boolean checkBoxSelected = driver.findElement(By.xpath("//label[@class='wgt-checkbox_label']")).isSelected();
		Thread.sleep(3000);
		System.out.println("is the checkbox Selected ? Ans:" + checkBoxSelected);
	}

	@Test(enabled = false, priority = 9)
	public void use_of_title() {
		System.out.println("The Title of the Page is: " + driver.getTitle());
	}

	@Test(enabled = false, priority = 9)
	public void use_of_get_current_url_method() {
		System.out.println("The Current URL is " + driver.getCurrentUrl());

	}

	@Test(enabled = false, priority = 10)
	public void use_of_get_text() {
		WebElement gtext = driver.findElement(By.xpath("//a[@id='retrieve-quote']"));
		System.out.println("The text for the web Element is " + gtext.getText());

	}

	@Test(enabled = false, priority = 11)
	public void use_of_get_attribute_method() {
		String value = driver.findElement(By.xpath("//a[@id='retrieve-quote']")).getAttribute("id");
		System.out.println("The Value of the id attribute is :" + value);
	}

	@Test(enabled = false, priority = 12)
	public void use_of_clear_method() {
		driver.findElement(By.xpath("//input[@class='zip']")).sendKeys("07502");
		driver.findElement(By.id("body-btn-get-quote")).click();
		driver.findElement(By.xpath("//input[@class='zip']")).clear();

	}

	@Test(enabled = false, priority = 13)
	public void use_of_sendKeys() throws InterruptedException {
		driver.findElement(By.name("zipCode")).sendKeys("07505", Keys.ENTER);
		Thread.sleep(2000);
	}

	@Test(enabled = false, priority = 14)
	public void use_of_navigate_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("https://www.td.com/us/en/personal-banking");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);

	}

}
