import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Example {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//WebDriver wb =new ChromeDriver();
		WebDriver wb =new FirefoxDriver();
		wb.get("http://www.google.com");
		
		System.out.print("Hello Bro ");

	}

}
