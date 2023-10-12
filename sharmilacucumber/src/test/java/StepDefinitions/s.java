package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class s {
	ChromeDriver ob;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	   System.out.println("in login page");
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharmila Pandy\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 ob=new ChromeDriver();
	ob.get("http://www.mycontactform.com");
	
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
		
		 System.out.println("enter user name and password");
		// id=user
			
			ob.findElementById("user").sendKeys("Sharmila123");
			
			//name=pass
			ob.findElementByName("pass").sendKeys("986");
			
		}

	@And("click on login button")
	public void click_on_login_button()
	{
		 System.out.println("clicking");
		 
		//login 
			
			ob.findElementByClassName("btn_log").click();
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() 
	{
	
	System.out.println("in home");
	ob.quit();
	}
}
