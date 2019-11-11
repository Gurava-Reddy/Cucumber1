package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	WebDriver driver;

	@Given("User is on adactin page")
	public void user_is_on_adactin_page() {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Gurava Reddy\\Selenium\\EclipsePractice\\TestNG_Deo\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://adactin.com/HotelApp/index.php");

		driver.manage().window().maximize();

	}

	@When("User enters User name and password")
	public void user_enters_User_name_and_password() {

		driver.findElement(By.id("username")).sendKeys("GuravaReddy");

		driver.findElement(By.id("password")).sendKeys("gu9885213891ru");

		System.out.println("User details entered");

	}

	@Then("User click the login button")
	public void user_click_the_login_button() {

		driver.findElement(By.id("login")).click();

		System.out.println("Login button");

		driver.quit();

	}

}
