package com.FirstProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	  WebDriver driver;
  @Test
  public void f() {
  WebElement username =	driver.findElement(By.id("UserNameTextBox"));
  username.sendKeys("vikas");
  
  WebElement password =	driver.findElement(By.id("PasswordTextBox"));
  password.sendKeys("password");
  
  WebElement LoginBtn =	driver.findElement(By.id("LoginButton"));
  LoginBtn.click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\FirstProject\\Resources\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://test.primeroedge.co/login.aspx?");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
