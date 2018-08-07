package com.cg.test;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	@FindBy(how=How.ID,using="twotabsearchtextbox")
	 WebElement twoTabSearchTextBox;
	
}
