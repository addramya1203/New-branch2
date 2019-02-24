import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers_webriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Desktop\\selenium_practical\\geckdriver\\geckodriver.exe");
		WebDriver obj =new FirefoxDriver();
		obj.get("http://google.com");*/
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium_practical\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();*/
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium_practical\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
	}

}
