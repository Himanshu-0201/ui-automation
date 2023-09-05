package katespade.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginElement {

	public static void main(String[] argr) throws InterruptedException {

//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		// Launch Chrome in incognito mode
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.katespade.com/");
		Thread.sleep(2000);

		// selected by cssSelector
		WebElement login_element = driver
				.findElement(By.cssSelector("[class = 'account_svg__icon-navigation-account']"));

		login_element.click();

		Thread.sleep(2000);

		// selected by id
		WebElement login_email_element = driver.findElement(By.id("login-form-email"));

		login_email_element.sendKeys("nagar.himanshu.1802@gmail.com");

		WebElement login_continue_button = driver.findElement(By.xpath(
				"//button[@type='submit' and @data-qa='al_fp_ctn_btn' and @class='btn btn-primary btn-block trackorder-signin-cta']"));

		login_continue_button.click();

		Thread.sleep(1000);

		WebElement password = driver.findElement(By.id("login-form-password"));
		password.sendKeys("Himanshu@12345");

		WebElement signIn_button = driver.findElement(By.xpath("//button[@data-qa='al_btn_signin']"));

		signIn_button.click();

	}
}
