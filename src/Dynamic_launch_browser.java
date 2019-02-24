import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class Dynamic_launch_browser {

	@Test(dataProvider="getData")
	public void launch(String browser,String username){
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Desktop\\selenium_practical\\geckdriver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium_practical\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium_practical\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
		
		WebDriver obj=null;
		
		
		if(browser.equals("Mozilla")) {
			
			obj=new FirefoxDriver();
		}
	
		else if(browser.equals("chrome")){
		obj=new ChromeDriver();
		}
		obj.get("http://google.com");
		obj.quit();
	}
		
		@DataProvider 
		public Object[][] getData(){
			
			Object[][] data=new Object[2][2];
			
			data[0][0]="Mozilla";
			data[0][1]="User1";
			
			data[1][0]="chrome";
			data[1][1]="User2";
			
			return data;
			
			
		}
	
	
	
}
