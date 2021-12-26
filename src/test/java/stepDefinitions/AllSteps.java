package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;


public class AllSteps {
	public static WebDriver driver;


	Login login=new Login(driver);
	Home home=new Home(driver);
	Booking book=new Booking(driver);
	ViewBooking view=new ViewBooking(driver);

	//	BookingClass booking=new BookingClass(driver);
	//	ViewBookings views=new ViewBookings(driver);

	@Given("user has opened Application")
	public void user_has_opened_Application() {
		// Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver", "C:\\installables\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("user has opened Application");


	}
	@When("user opens Home page")
	public void user_opens_Home_page() {
		//	    // Write code here that turns the phrase above into concrete actions

		driver.get("http://localhost:8080/FlyAway/");
		driver.manage().window().maximize();
		System.out.println("user opens Home page");

	}
	@And("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		System.out.println("user should be navigated to home page");

	}
	@And("user has opened login page")
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
	@When("user opts to register")
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
	@And("user enters details")
	public void user_enters_details() {
	

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

		login.Login();

	}
	@Then("user logged in")
	public void user_logged_in() {
		System.out.println("user logged in");
	}

	@Given("User is on dashboard")
	public void user_is_on_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on dashboard");
	}

	@When("user clicks home")
	public void user_clicks_home() {
		// Write code here that turns the phrase above into concrete actions
		
		home.Home();

	}

	@When("user selects bangalore as from place and selects hyderabad as to place")
	public void user_selects_bangalore_as_from_place() {
		book.Booking();


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
		view.ViewBooking();
	}

	@Then("user see the flyaway bookings")
	public void user_see_the_flyaway_bookings() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user see the flyaway bookings");
	}

}


