package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	public void Login() {
    	driver.findElement(By.name("email_id")).sendKeys("parthi203@domain.com");
    	driver.findElement(By.name("pwd")).sendKeys("parthi007");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.tagName("button")).click();
		System.out.println("user enter login details");
		
        
    } 

}
