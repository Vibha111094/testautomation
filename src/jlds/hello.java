package jlds;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Servlet implementation class lasttry
 */
@WebServlet("/lasttry")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		try{
		int a=0;
		 WebDriver driver;
		  String baseUrl;
		  boolean acceptNextAlert = true;
		  StringBuffer verificationErrors = new StringBuffer();
		  driver = new FirefoxDriver();
		 
		    baseUrl = "https://cloudsimba1.com";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.get(baseUrl + "/");
		    driver.findElement(By.id("loginbtn")).click();
		    driver.findElement(By.id("emaillogin")).sendKeys("abc@gmail.com");
		    driver.findElement(By.id("passwordlogin")).sendKeys("Welcome@12345");
		    driver.findElement(By.id("logbtn")).click();
		}catch (Exception e)
		{
			System.out.println("login not  possible");
		}
		 /*   try
		    {
		    driver.findElement(By.id("plantype"));
		    }catch (Exception e)
		     {
		    	a=1;
		    	System.out.println("login not  possible");
		    	}
		    if(a==0)
		    {
		    	System.out.println("login not  possible");
		    }
		System.out.println("hi");*/
		    if (session != null)System.out.println("login  possible");
		    
		   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
