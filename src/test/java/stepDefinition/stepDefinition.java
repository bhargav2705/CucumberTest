package stepDefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import functions.cucumberFunction;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefinition 
{
	WebDriver driver;	
	
	@Before()

		public void setUp()
		{
		WebDriverManager.chromedriver().setup();
		}
		
@After()

public void teardown()
{
	driver.quit();
}
	
	@Given("^user navigates to the documentation page\\.$")
	public void user_navigates_to_the_documentation_page() throws Throwable 
	{
		driver=new ChromeDriver();
		driver.get("https://developer.here.com/documentation");
	   
	}

	@Then("^find all the links in the page except header and footer$")
	public void find_all_the_links_in_the_page_except_header_and_footer() throws Throwable {
	 List<WebElement>allvalidLinks = cucumberFunction.findAllLinks(driver);
	   
	}

	@Then("^verify the response is correct and no broken links$")
	public void verify_the_response_is_correct_and_no_broken_links() throws Throwable 
	{

           int responseCode=200;
		 List urllist=new ArrayList();
		 List<WebElement> allvalidLinks =cucumberFunction.findAllLinks(driver);
		 System.out.println("Total number of valid links found " + allvalidLinks.size());
		    for( WebElement element : allvalidLinks)
		    {
		    String urlnew=element.getAttribute("href");	
		    responseCode=cucumberFunction.isLinkBroken(urlnew);
		    if(responseCode >=400)
		    {
		    	System.out.println(element.getAttribute("href") + "is broken link");
		    }
		   
		    else
		    {
		    	System.out.println(element.getAttribute("href") + "is a valid link");
		       	
		    	
		    }
		    
		    }
		 
	}

	@Then("^click on each link identified and verify the page is loaded$")
	public void click_on_each_link_identified_and_verify_the_page_is_loaded() throws Throwable 
	{
	 Boolean pagestatus=cucumberFunction.verifyPageLoad(driver);
   if (pagestatus==true)
	    {
	    	System.out.println("Angular is not loaded");
	    }
	    
	    else
	    {
	    	System.out.println("Angular is getting loaded correctly for all pages");
	    }
	    
	    
	}
	


}

	
	




