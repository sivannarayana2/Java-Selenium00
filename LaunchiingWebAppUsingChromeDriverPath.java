package Testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchiingWebAppUsingChromeDriverPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\New folder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}

}
