
/*
 * Checking whether the functions in the Make Appointment page works.
 * Making sure the "DROP DOWN", "CHECK BOX", "RADIO BUTTON", "TEXT AREA" functionalities works properly.
 * */

package org.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Appointment {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\yoges\\eclipse-workspace\\Cura_herokuapp\\Drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://katalon-demo-cura.herokuapp.com/");

		driver.manage().window().maximize();

		// Click "Make Appointment" Button
		WebElement btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
		btn.click();

		WebElement userName = driver.findElement(By.xpath("//input[@id='txt-username']"));
		userName.sendKeys("John Doe");

		WebElement pass = driver.findElement(By.xpath("//input[@id='txt-password']"));
		pass.sendKeys("ThisIsNotAPassword");

		WebElement login = driver.findElement(By.xpath("//button[@id='btn-login']"));
		login.click();

		WebElement dropDown = driver.findElement(By.xpath("//select[@id='combo_facility']"));
		Select s = new Select(dropDown);
		s.selectByVisibleText("Hongkong CURA Healthcare Center");

		WebElement checkBox = driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']"));
		checkBox.click();

		WebElement radio = driver.findElement(By.xpath("//input[@id='radio_program_medicaid']"));
		radio.click();

		WebElement date = driver.findElement(By.xpath("//input[@id='txt_visit_date']"));
		date.sendKeys("02/05/2024");

		WebElement comment = driver.findElement(By.xpath("//textarea[@id='txt_comment']"));
		comment.sendKeys("Regarding heart problem");

		WebElement button = driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));
		button.click();
		
		WebElement home = driver.findElement(By.xpath("//a[@class='btn btn-default']"));
		home.click();
		
		driver.quit();

	}

}
