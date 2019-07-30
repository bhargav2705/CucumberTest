package functions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cucumberFunction 
{

	 public static List<WebElement> findAllLinks(WebDriver driver)
	  {
	  
		 List<WebElement>links=driver.findElements(By.xpath(".//div[@class='documentation-link-features']/a"));
		 List<WebElement> finallist=new ArrayList();
		 
		 
		 for (int i=0;i<links.size();i++)
		 {
			 
			 if ((links.get(i).getAttribute("href"))!=null)
			 {
				 finallist.add(links.get(i));
				 
			 }
			 
		 }
		 
		 return finallist;
		  
		  
	  }
	  
	 	public static int isLinkBroken(String url) throws Exception

		{
	       String urltest=url;
	 		int response = 200;
			HttpURLConnection connection = (HttpURLConnection)(new URL (urltest).openConnection());
			connection.setRequestMethod("HEAD");
			connection.connect();
			response = connection.getResponseCode();	
			connection.disconnect();
		     return response;

		}
	 	
	 	 	
	 	public static List<String> getPageUrl(WebDriver driver)
	 	{
			List<WebElement> url=findAllLinks(driver);
	 		List<String> urllist=new ArrayList();
	 		
	 		
	 		for (WebElement elements:url)
	 		{
	 			urllist.add(elements.getAttribute("href"));
	 		
	 		}
			return urllist;
	 		
	 	}
			
	 public static boolean verifyPageLoad(WebDriver driver)
	  {
		List <String> pageurl=getPageUrl(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Boolean status=true;
		for (int i=0;i<pageurl.size();i++)
		{
			driver.get(pageurl.get(i));
		
		  status = (Boolean)js.executeScript("return window.angular === undefined");
         if(status==true)
	 	  	{
				
       		System.out.println("Angular is  not loaded :" +pageurl.get(i));
			break;
			}
		 
			else
			{
				System.out.println("Angular is loaded :" +pageurl.get(i));
			}
			
		}
		
		
		return status;
	   	
}

}