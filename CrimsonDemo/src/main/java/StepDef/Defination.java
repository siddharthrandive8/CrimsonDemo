package StepDef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v117.network.model.IPAddressSpace;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Defination {
	
	private WebDriver driver;
	
	
	@Given("Open Browser and launch the application")
	public void open_browser_and_launch_the_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("http://dev.cloud.trinka.ai/signin");
		
	}
	
	

	@When("Sign up on Trinka")
	public void sign_up_on_trinka() {
	
	
	driver.findElement(By.id("signUpNow")).click();
	driver.findElement(By.id("userEmail")).sendKeys("Siddharthrandive@gmail.com");
	driver.findElement(By.id("userSignUpPassword")).sendKeys("SimplePass");
	driver.findElement(By.id("userFirstName")).sendKeys("Siddharth");
	driver.findElement(By.id("userLastName")).sendKeys("sid");
	driver.findElement(By.id("signUpRegister")).click();
	
		

	}

	@Then("User click on menu")
	public void user_click_on_menu() {
		driver.findElement(By.xpath("//*[contains(text(), 'Marketer')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Get Started')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Upgrade')]")).click();
		
		

	}

	@Then("Switch Back to Previous Window")
	public void switch_back_to_previous_window() {
		
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		//swtich to parent tab
		driver.switchTo().window(newTb.get(0));

	}

	@Then("User Logout From the Page")
	public void user_logout_from_the_page() {
		driver.findElement(By.xpath("//*[@id=\"side_bar_sections\"]/mat-sidenav-content/div/div[2]/span/button")).click();
		driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div/button")).click();
		driver.quit();
	}







}
