package selenium;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowseTesting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("Choose the below option to invoke browser (Example : 1/2/3/4/5) ");
		System.out.println("1. Chrome 2. Edge 3. Firefox 4. Internet Explorer 5. Safari ");
		input = sc.nextInt();
		WebDriver driver;
		//To Choose the user selected browsers
		switch(input) {
		case 1 : driver = new ChromeDriver();
				 break;
		case 2 : driver = new EdgeDriver();
				 break;
		case 3 : driver = new FirefoxDriver();
				 break;
		case 4 : driver = new InternetExplorerDriver();
				 break;
		case 5 : driver = new SafariDriver();
				 break;
		default : System.out.println("You have not selected correct option. Default Chrome Browser will be invoked.");
				  driver = new ChromeDriver();		
		}
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.softwaretestingo.com/");
		System.out.println("Page Title :: "+driver.getTitle());
		//To Quit the browser
		driver.quit();
		sc.close();
		
	}

}
