package metodos;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void validarTexto(String texto, By elmento) {
		String text = driver.findElement(elmento).getText();
		System.out.println(text);
		assertEquals(texto, text);
	}

	public void execultarNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40000, TimeUnit.MILLISECONDS);
	}
}
