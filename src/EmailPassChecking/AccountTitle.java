package EmailPassChecking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccountTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Firfox
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		String Expected_title="Account Login";
		
		String Actual_title=driver.getTitle();
		
		if(Expected_title.equals(Actual_title)) 
			{
			System.out.println("Pass");
			}
		else {
			System.out.println("Fail");
		}
		driver.quit();

}
}