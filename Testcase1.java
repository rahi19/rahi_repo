package com.testcases;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Testcase1 {
	
	@Test(priority =1)		
		public void test() {
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
		String actTitle=driver.getTitle();
		String expTitle="JavaByKiran | Log in";
		Assert.assertEquals(actTitle, expTitle);
		driver.manage().window().maximize();
		driver.close();
		
	}
	
	@Test(priority =2)
	public void test1() {
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actUname = driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
		String ExpUname= "Please enter email.";
		Assert.assertEquals(actUname,ExpUname);
		driver.close();
		}
	
	@Test(priority =3)
	public void test2() {
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actUname = driver.getTitle();
		String ExpUname= "JavaByKiran | Dashboard";
		Assert.assertEquals(actUname,ExpUname);
		driver.close();
	}
	
	

	@Test(priority =4)
	public void test3() {
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/dashboard.html");
		String actTitle=driver.getTitle();
		String ExpTitle="JavaByKiran | Dashboard";
		Assert.assertEquals(actTitle,ExpTitle);
		driver.close();
	}



	
	@Test(priority=5)
			
			public void testcase4() {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/users.html");
		String ActTitle=driver.getTitle();
		String ExpTitle="JavaByKiran | User";
		Assert.assertEquals(ActTitle, ExpTitle);
		driver.close();
	}
	
	
	@Test(priority=6)
	public void testcase5() {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/operators.html");
		String ActTitle=driver.getTitle();
		String ExTitle="JavaByKiran | Operators";
		Assert.assertEquals(ActTitle, ExTitle);
		driver.close();
		}
	
	@Test(priority=7)
	public void testcase6() {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/links.html");
		String actTitle=driver.getTitle();
		String expTitle="JavaByKiran | Useful Links";
		Assert.assertEquals(actTitle, expTitle);
		driver.close();
	}
	
	@Test(priority=8)
	public void testcase7() {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/downloads.html");
		String actTitle=driver.getTitle();
		String expTitle="JavaByKiran | Downloads";
		Assert.assertEquals(actTitle, expTitle);
		driver.close();
	}
	

	@Test(priority=9)
	public void testcase8() {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/logout.html");
		String actTitle=driver.getTitle();
		String expTitle="JavaByKiran | Log in";
		Assert.assertEquals(actTitle, expTitle);
		driver.close();
	}

	@Test(priority=10)
	public void testcases9() {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
	String act= driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
	String exp="Java By Kiran";
	Assert.assertEquals(act, exp);
	driver.close();
	}

		@Test(priority=11)
	public void testcases10() {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html#");
	String act=driver.findElement(By.xpath("/html/body/div/div[1]/a")).getText();
	String exp="[Java By Kiran\r\n" + 
			"JAVA | SELENIUM | PYTHON]";
	Assert.assertEquals(act, exp);
	driver.close();
}

@Test(priority=12)
public void testcase11() {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html#");
	String act =driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
	String exp="Sign in to start your session";
	Assert.assertEquals(act,exp);
	driver.close();
	
	
	
	
}

@Test(priority=13)
public void testcase12() {

WebDriver driver=new FirefoxDriver();
driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html#");
 driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
 String act= driver.getTitle();
 String exp="JavaByKiran | Registration Page";
 Assert.assertEquals(act,exp);
 driver.close();

}

		@Test(priority=14)
		public void testcase13() {
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/register.html");
			driver.findElement(By.id("name")).sendKeys("Rahi");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		String act=driver.findElement(By.xpath("//*[@id=\"mobile_error\"]")).getText();
		String exp="Please enter Mobile.";
		Assert.assertEquals(act,exp);
		driver.close();
		}
		
		@Test(priority=15)
		public void testcase14(){
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/register.html");
			driver.findElement(By.id("name")).sendKeys("Rahi");
			driver.findElement(By.id("mobile")).sendKeys("q739387681");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
			String act=driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
			String exp="Please enter Email.";
			driver.close();
			
		}
		
		@Test(priority=16)
		public void testcase15() {
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/register.html");
			driver.findElement(By.id("name")).sendKeys("Rahi");
			driver.findElement(By.id("mobile")).sendKeys("q739387681");
			driver.findElement(By.id("email")).sendKeys("TTYWQHUH");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
			String act=driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
			String exp="Please enter valid email.";
			Assert.assertEquals(act,exp);
			driver.close();
		}

		@Test(priority=17)
		public void testcase16() {
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/register.html");
			driver.findElement(By.id("name")).sendKeys("Rahi");
			driver.findElement(By.id("mobile")).sendKeys("q739387681");
			driver.findElement(By.id("email")).sendKeys("XYZ@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
			String act=driver.findElement(By.xpath("//*[@id=\"password_error\"]")).getText();
			String exp="Please enter Password.";
			driver.close();
			
		}
		
		@Test(priority=18)
		public void testcase17() {
			
			
			WebDriver driver =new FirefoxDriver();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/register.html");
			driver.findElement(By.id("name")).sendKeys("Rahi");
			driver.findElement(By.id("mobile")).sendKeys("q739387681");
			driver.findElement(By.id("email")).sendKeys("XYZ@gmail.com");
			driver.findElement(By.id("password")).sendKeys("12345678");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		}
		
		
		@Test(priority=19)

		public void testcase18() {
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/dashboard.html");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
		driver.close();

}

		
		@Test(priority=20)
		public void testcase19() {
			
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
		driver.close();

	}
		@Test(priority=21)
		public void testcase20() {
			
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/dashboard.html");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();
		driver.close();
		

	}
			@Test(priority=22)
			public void testcase21() {
				
				WebDriver driver=new FirefoxDriver();
				driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
				driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
				driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/dashboard.html");
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a/i")).click();
			driver.close();
			

		}
			
			@Test(priority=23)
			public void testcase22() {
				
				WebDriver driver=new FirefoxDriver();
				driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
				driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
				driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/users.html");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
			String act=driver.getTitle();
			String exp="JavaByKiran | Add User";
			driver.close();
			

		}
			@Test(priority=24)
			public void testcase23() {
				
				WebDriver driver=new FirefoxDriver();
				driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
				driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
				driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/users.html");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
			driver.findElement(By.id("username")).sendKeys("aabbccc");
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			driver.close();
			

		}

			@Test(priority=25)
			public void testcase24() {
				
				WebDriver driver=new FirefoxDriver();
				driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/index.html");
				driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
				driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
			driver.get("file:///C:/Rahi_selenium/Offline_website/Offline%20Website/pages/examples/users.html");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
			driver.findElement(By.id("username")).sendKeys("aabbccc");
			driver.findElement(By.id("mobile")).sendKeys("1234567891");
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			Alert al=driver.switchTo().alert();
			al.accept();
			
			driver.close();
}
}

/*
@Test(priority=1)
public void Registartion() throws IOException {
	FileInputStream fis=new FileInputStream("abc.properties	");
	Properties prop=new Properties();
	prop.load(fis);
	String url=prop.getProperty("url");
	WebDriver driver=new FirefoxDriver();
	driver.get(prop.getProperty("url"));
	driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
driver.close();
}

*/









	
