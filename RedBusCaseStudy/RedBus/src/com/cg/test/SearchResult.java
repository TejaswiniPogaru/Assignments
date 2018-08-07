package com.cg.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResult {
	
	@FindBy(how=How.XPATH,using="//*[@id=\"10110097\"]/div/div[2]/div[1]")
	WebElement viewseats;
	@FindBy(how=How.XPATH,using="//*[@id=\"10110097\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]")
	WebElement boardPoint;
	@FindBy(how=How.XPATH,using="//*[@id=\"10110097\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]")
	WebElement dropingPoint;
	@FindBy(how=How.XPATH,using="//*[@id=\"10110097\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")
	WebElement proceed;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-04\"]")
	WebElement name;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-01\"]")
	WebElement age;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-05\"]")
	WebElement mail;
	@FindBy(how=How.XPATH,using="//*[@id=\"seatno-06\"]")
	WebElement phone;
	private static WebElement element;
	
	public static WebElement selectSeat(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"rt_10110097\"]/div/div/div/div[3]/div[2]/div[2]/canvas"));
		
	    Actions builder = new Actions(driver);
	    builder.moveToElement(element,60,30).click().build().perform();
	    
		return element;
	}
	
	public static WebElement selectGender(WebDriver driver)
	{
		List<WebElement> gender = driver.findElements(By.name("Gender0"));
		gender.get(1).click();
		return element;
	}
	
}
