package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StorySteps {
	WebDriver driver;
	@Given("^The webpage of RedBus is loaded$")
	public void the_webpage_of_RedBus_is_loaded() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	}

	@When("^\"([^\"]*)\" and \"([^\"]*)\" are provided$")
	public void and_are_provided(String arg1, String arg2) throws Throwable {
		HomePage page = PageFactory.initElements(driver, HomePage.class);	
		page.source.sendKeys(arg1);
		Thread.sleep(2000);
		page.source.sendKeys(Keys.ENTER);
		page.destination.sendKeys(arg2);
		Thread.sleep(2000);
		page.destination.sendKeys(Keys.ENTER);
	
	}

	@When("^selecting journey date is provided$")
	public void selecting_journey_date_is_provided() throws Throwable {
				Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[3]")).click();
		driver.findElement(By.id("search_btn")).click();
	}


	@Then("^Book ticket for the corresponding details$")
	public void book_ticket_for_the_corresponding_details() throws Throwable {
		Thread.sleep(2000);
		SearchResult page = PageFactory.initElements(driver, SearchResult.class);
		page.viewseats.click();
	   
	   Thread.sleep(4000);
	   
	   SearchResult.selectSeat(driver);
	   Thread.sleep(4000);
	  
	   page.boardPoint.click();
	   Thread.sleep(1000);
	   page.dropingPoint.click();
	  Thread.sleep(2000);
	 page.proceed.click();
	}

@Then("^Enter person details$")
public void enter_person_details() throws Throwable {
	Thread.sleep(2000);
	SearchResult page = PageFactory.initElements(driver, SearchResult.class);
	page.name.sendKeys("Tejaswini Pogaru");
  SearchResult.selectGender(driver);
  page.age.sendKeys("21");
  page.mail.sendKeys("Tejaswini.Pogaru@gmail.com");
  page.phone.sendKeys("9603240615");
  
}




}
