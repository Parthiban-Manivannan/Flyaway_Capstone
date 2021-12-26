package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ViewBooking {
	WebDriver driver;
	public ViewBooking(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	public void ViewBooking() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.findElement(By.xpath("//*[contains(text(),'See Your Bookings')]")).click();
    	System.out.println("user clicks see your bookings button");
       
		
	}

}
