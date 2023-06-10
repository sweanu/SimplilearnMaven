package testCases;



import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Loginpage;

public class Logintest extends Baseclass {

	@Test
	
	public void test1()
	{
		Loginpage login=new Loginpage(driver);
		login.Loginfunction("swean@gmail.com","Cyssfsgt@1");
		WebElement id=driver.findElement(By.id("msg_box"));
		String acterror= id.getText();
		String exerror= "The email or password you have entered is invalid.";
		
		AssertJUnit.assertEquals(acterror, exerror);
		/*if(acterror.equals(exerror))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
		
	}
	@Test
	public void test2()
	{
		Loginpage login=new Loginpage(driver);
		login.Loginfunction("swe@gmail.com","Cystfsdgvfal@1");
		
	}
	
	@Test
	public void test4() throws FilloException {
		
		Recordset recordset = connection.executeQuery("select * from data where TestName='test4'");
		recordset.next();
			
		String UserName = recordset.getField("UserName");
		String Password = recordset.getField("Password");
		
		Loginpage login = new Loginpage(driver);
		login.Loginfunction(UserName, Password);

		
	}

	


}
