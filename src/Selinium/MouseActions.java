package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://demo.opencart.com/index.php?route=account/login");
	Actions Act=new Actions(driver);
	//WebElement Desktop =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	//WebElement Mac =driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	//Act.moveToElement(Desktop).moveToElement(Mac).click().perform();
	
	//Drag and Drop
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	WebElement from=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement to=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	Act.dragAndDrop(from, to).perform();
	
	

	}

}
