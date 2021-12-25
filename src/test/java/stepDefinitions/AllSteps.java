package stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllSteps {
	public static WebDriver driver;
	
	@Given("user has opened Application")
	public void user_has_opened_Application() {
	    // Write code here that turns the phrase above into concrete actions
	
		System.setProperty("webdriver.chrome.driver", "C:\\installables\\chromedriver.exe");
	    driver = new ChromeDriver();
		System.out.println("user has opened Application");
		
	}
	@When("user opens Home page")
	public void user_opens_Home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
	    driver.get("http://localhost:8080/FlyAway/");
		driver.manage().window().maximize();
		System.out.println("user opens Home page");
		
	}
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		System.out.println("user should be navigated to home page");
		
	}
	@When("user has opened login page")
	public void user_has_opened_login_page() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Login/Signup")).click();
		System.out.println("user has opened login page");
	}
	@And("user opts to register")
	public void user_opts_to_register() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Not a member? Signup")).click();
		System.out.println("user opts to register");
		
	}
	@And("user enters details required")
	public void user_enters_details_required() {
		driver.findElement(By.name("email_id")).sendKeys("parthi203@domain.com");
		driver.findElement(By.name("pwd")).sendKeys("parthi007");
		driver.findElement(By.name("pwd2")).sendKeys("parthi007");
		driver.findElement(By.name("name")).sendKeys("Parthiban");
		driver.findElement(By.name("address")).sendKeys("45/78 A, Velu Street,Valapaddy(TK)");
		driver.findElement(By.name("city")).sendKeys("Salem");
        System.out.println("user enters details required");
		
	
		
	}
	@And("user enter sign up button")
	public void user_enter_sign_up_button() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.tagName("button")).click();
		System.out.println("user enter sign up button");
		
	}
	@Then("user sign up successfully")
	public void user_sign_up_successfully() {
		System.out.println("user sign up successfully");
	}
	@Given("user has on registration confirmed page")
	public void user_has_on_registration_confirmed_page() {
		
	    System.out.println("user has on registration confirmed page");
	}
    @When("user clicks on login page")
    public void user_clicks_on_login_page() {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.findElement(By.xpath("//*[contains(text(),'Login to continue checking flights')]")).click();
    	System.out.println("user clicks on login page");
    	
    }
    @And("user enter login details")
    public void user_enter_login_details() {
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
    
    @Given("User is on dashboard")
    public void user_is_on_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on dashboard");
    }

    @When("user clicks home")
    public void user_clicks_home() {
        // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();
    	System.out.println("user clicks home");
    	
    }

    @When("user selects bangalore as from place")
    public void user_selects_bangalore_as_from_place() {
        // Write code here that turns the phrase above into concrete actions
    	Select dropdown = new Select(driver.findElement(By.name("source")));  
    	dropdown.selectByVisibleText("Bangalore"); 
    	System.out.println("user selects bangalore as from place");
    }

    @When("user selects hyderabad as to place")
    public void user_selects_hyderabad_as_to_place() {
    	Select dropdown = new Select(driver.findElement(By.name("destination")));  
    	dropdown.selectByVisibleText("Hyderabad");  
    	System.out.println("user selects hyderabad as to place");
      
    }

    @When("user clicks submit button")
    public void user_clicks_submit_button() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();
    	System.out.println("user clicks submit button");
        
    }

    @When("user clicks Book flight button")
    public void user_clicks_Book_flight_button() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.findElement(By.xpath("//*[contains(text(),'Book Flight')]")).click();
    	System.out.println("user clicks Book flight button");
      
    }

    @When("user clicks complete bookings button")
    public void user_clicks_complete_bookings_button() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    	driver.findElement(By.xpath("//*[contains(text(),'Click to complete booking')]")).click();
    	System.out.println("user clicks complete bookings button");
    }

    @When("user clicks see your bookings button")
    public void user_clicks_see_your_bookings_button() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.findElement(By.xpath("//*[contains(text(),'See Your Bookings')]")).click();
    	System.out.println("user clicks see your bookings button");
       
    }

    @Then("user see the flyaway bookings")
    public void user_see_the_flyaway_bookings() {
        // Write code here that turns the phrase above into concrete actions
      System.out.println("user see the flyaway bookings");
    }

}


