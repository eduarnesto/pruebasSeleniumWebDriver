package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class PruebasSelenium {
	
	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();
		
	}

	@Test
	void test1() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("Calle inventada");
        cpBox.sendKeys("1234");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement errorCP = driver1.findElement(By.id("errorCP"));
        boolean texto = errorCP.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDireccion"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
	}

	@Test
	void test2() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement direccionBox = driver1.findElement(By.id("direccion"));        
        WebElement cpBox = driver1.findElement(By.id("cp"));
        
        direccionBox.sendKeys("Calle inventada");
        cpBox.sendKeys("12345");
        
        
        WebElement submitButton = driver1.findElement(By.id("enviar"));
        submitButton.click();
        
        WebElement direccionCorrecta = driver1.findElement(By.id("cabecera"));
        String textoDireccion = direccionCorrecta.getText();
        assertEquals("Dirección correcta", textoDireccion);
        
	}
	/*
	@AfterAll
	static void exitDriver() {
		driver1.quit();
	}*/
}
