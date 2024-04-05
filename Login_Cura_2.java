
/*
 * Checking whether the Burger button works.
 * Checking whether the login page works as well.
 * */

package org.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Login_Cura_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\yoges\\eclipse-workspace\\Cura_herokuapp\\Drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://katalon-demo-cura.herokuapp.com/");

		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("//a[@id='menu-toggle']"));
		btn.click();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='txt-username']"));
		userName.sendKeys("John Doe");

		WebElement pass = driver.findElement(By.xpath("//input[@id='txt-password']"));
		pass.sendKeys("ThisIsNotAPassword");

		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='btn-login']"));
		loginBtn.click();

	}

}
