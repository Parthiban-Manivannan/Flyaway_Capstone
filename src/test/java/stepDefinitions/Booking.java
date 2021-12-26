package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking {
	WebDriver driver;
	public Booking(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	public void Booking() {
		Select dropdown = new Select(driver.findElement(By.name("source")));  
    	dropdown.selectByVisibleText("Bangalore"); 
    	System.out.println("user selects bangalore as from place");
    	
    	Select dropdown1 = new Select(driver.findElement(By.name("destination")));  
    	dropdown1.selectByVisibleText("Hyderabad");  
    	System.out.println("user selects hyderabad as to place");
	}

}
