package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.internal.SingleKeyAction;

public class PageObjectManager {
public static WebDriver driver;
public static HomePage hp;
public static SiginPage  sgnp;
public static BookOrder bo;
public static PlaceOrder po;
public PageObjectManager(WebDriver ldriver)
{
	this.driver=ldriver;

	}

public  static HomePage getHp() {
	hp=new HomePage(driver);
	return hp;
}
public static  SiginPage getSgnp() {
	sgnp=new SiginPage(driver);
	return sgnp;
}
public static BookOrder getBo() {
	bo =new BookOrder(driver);
	return bo;
}
public static PlaceOrder getPo() {
	po = new PlaceOrder(driver);
	return po;
}}
