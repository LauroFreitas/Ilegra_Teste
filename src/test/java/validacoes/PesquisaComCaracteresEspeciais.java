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


public class PesquisaComCaracteresEspeciais {
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
		driver.findElement(By.name("s")).sendKeys("'");
		driver.findElement(By.cssSelector(".desktop-search .search-submit")).click();
		  
		WebElement element = driver.findElement(By.cssSelector("body.search.search-results.custom-background.wp-custom-logo.wp-embed-responsive.customizer-styles-applied.has-thumb.custom-logo-on.slider-on.offcanvas-widgets-off.highlander-enabled.highlander-light.imgfade-on:nth-child(2) div.content-wrap:nth-child(3) div.blog-wrap.cf div.site-content.cf header.archive-header:nth-child(1) h1.archive-title > span:nth-child(1)"));
		 	Assert.assertThat(element.getText(),
				is("'"));

		 	 	 	
	 }


}
