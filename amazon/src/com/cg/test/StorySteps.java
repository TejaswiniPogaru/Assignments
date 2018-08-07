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

	@Given("^The webpage of Amazon is loaded$")
	public void the_webpage_of_Amazon_is_loaded() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@When("^five products are selected$")
	public void five_products_are_selected() throws Throwable {
	   /* HomePage.searchBox(driver).sendKeys("oneplus 6");
	    HomePage.searchBox(driver).sendKeys(Keys.ENTER);*/
		HomePage page = PageFactory.initElements(driver, HomePage.class);
		page.twoTabSearchTextBox.sendKeys("oneplus 6");
		page.twoTabSearchTextBox.sendKeys(Keys.ENTER);
		SearchResult page1 = PageFactory.initElements(driver, SearchResult.class);
	    page1.selectOnePLUS.click();
	    
	    driver.navigate().to("https://www.amazon.in/OnePlus-Red-8GB-128GB-Memory/dp/B077PW9ZRG/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533542807&sr=1-1&keywords=oneplus+6");
	    String main=driver.getWindowHandle();
	    for(String handle:driver.getWindowHandles())
	    {
	    	driver.switchTo().window(handle);
	    }
	    driver.close();
	    driver.switchTo().window(main);
	    page1.addtocart.click();
	    driver.navigate().to("https://www.amazon.in/");
	    page.twoTabSearchTextBox.sendKeys("iphone x");
	    page.twoTabSearchTextBox.sendKeys(Keys.ENTER);
	    page1.selectIphone.click();
	    driver.navigate().to("https://www.amazon.in/Apple-iPhone-Space-Grey-64GB/dp/B072LPF91D/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533548860&sr=1-1&keywords=iphone+x");
	    main=driver.getWindowHandle();
	    for(String handle:driver.getWindowHandles())
	    {
	    	driver.switchTo().window(handle);
	    }
	    driver.close();
	    driver.switchTo().window(main);
	   page1.addtocart.click();
	    
	    driver.navigate().to("https://www.amazon.in/");
	    page.twoTabSearchTextBox.sendKeys("hp spectre x360");
	    page.twoTabSearchTextBox.sendKeys(Keys.ENTER);
	   page1.selectHp.click();
	    driver.navigate().to("https://www.amazon.in/HP-x360-Convertible-13-ae502TU-13-3-inch/dp/B079Y8CGQH/ref=sr_1_1?s=computers&ie=UTF8&qid=1533549587&sr=1-1&keywords=hp+spectre+x360");
	    main=driver.getWindowHandle();
	    for(String handle:driver.getWindowHandles())
	    {
	    	driver.switchTo().window(handle);
	    }
	    driver.close();
	    driver.switchTo().window(main);
	    page1.addtocart.click();
	    
	    driver.navigate().to("https://www.amazon.in/");
	    page.twoTabSearchTextBox.sendKeys("playstation 4");
	    page.twoTabSearchTextBox.sendKeys(Keys.ENTER);
	    page1.selectps4.click();
	    driver.navigate().to("https://www.amazon.in/Sony-Slim-Console-Free-Games/dp/B07D7PH5GP/ref=sr_1_2?s=videogames&ie=UTF8&qid=1533549629&sr=1-2&keywords=playstation+4");
	    main=driver.getWindowHandle();
	    for(String handle:driver.getWindowHandles())
	    {
	    	driver.switchTo().window(handle);
	    }
	    driver.close();
	    driver.switchTo().window(main);
	    page1.addtocart.click();
	}
	@Then("^Buy them$")
	public void buy_them() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
	 
	}



}
