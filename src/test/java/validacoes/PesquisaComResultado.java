package validacoes;


import static org.hamcrest.CoreMatchers.is;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PesquisaComResultado {
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

		driver.navigate().to("https://blogdoagi.com.br/");
		
		driver.manage().window().setSize(new Dimension(1417, 728));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("search-open")).click();
		driver.findElement(By.name("s")).sendKeys("Agibank amplia atuação nacional e deve inaugurar 20 novas lojas ainda neste ano");
		driver.findElement(By.cssSelector(".desktop-search .search-submit")).click();
		  
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Instituição já opera em todas as cidades do Brasil')]"));
		 	Assert.assertThat(element.getText(),
				is("Instituição já opera em todas as cidades do Brasil com mais de 100 mil habitantes, e vai abrir 20 unidades em cidades menores nos próximos meses."));

		 	 	 	
	 }


}
