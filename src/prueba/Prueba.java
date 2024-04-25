package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba {

	public static void main(String[] args) {
		
		WebDriver driver1 = new ChromeDriver();
		
		
        driver1.get("https://www.selenium.dev/selenium/web/web-form.html");        
        

        WebElement textBox = driver1.findElement(By.id("my-text-id"));        
        WebElement passwordBox = driver1.findElement(By.name("my-password"));
        
        
        textBox.sendKeys("Selenium");
        passwordBox.sendKeys("1234");
        
        
        WebElement submitButton = driver1.findElement(By.cssSelector("button"));
        submitButton.click();
        
	}

}
