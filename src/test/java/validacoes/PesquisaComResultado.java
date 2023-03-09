package validacoes;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
//Lauro H.S Freitas


public class PesquisaTest {
	public WebDriver driver;
	 
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "Drives/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Main() {

		driver.navigate().to("https://www.google.com");
	 }


}
