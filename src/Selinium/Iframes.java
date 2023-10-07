package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframes {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("priyanka");
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Karthik");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
		

	}

}
