package seleniumWebDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {
	public static void main(String[] args) {  
        
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");  
	    WebDriver driver=new ChromeDriver();  
	      
	 
	    driver.navigate().to("http://automation-test.in/");  
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("actionbar")).click(); 
	    
	    driver.findElement(By.name("email")).sendKeys("contact@uxdata.in");
	    
	    driver.findElement(By.xpath(" //*[@id=\"follow-bubble\"]/div[2]/ul/form/div[2]/button")).click();
	    
	  
	          
//	    // Click on the search text box and send value 
//	    driver.findElement(By.name("Contact")).click();  
//	          
//	    // Click on the search button  
//	    driver.findElement(By.id("Home")).click();  
	   // driver.quit();
	      
	    }  

}
