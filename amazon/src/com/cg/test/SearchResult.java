package com.cg.test;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResult {
	@FindBy(how=How.XPATH,using="//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")
	WebElement selectOnePLUS;
	@FindBy(how=How.ID,using="add-to-cart-button")
	WebElement addtocart;
	@FindBy(how=How.XPATH,using="//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")
	WebElement selectIphone;
	@FindBy(how=How.XPATH,using="//*[@id=\"result_0\"]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2")
	WebElement selectHp;
	@FindBy(how=How.XPATH,using="//*[@id=\"result_1\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")
	WebElement selectps4;
	
	}
