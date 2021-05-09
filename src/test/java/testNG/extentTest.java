package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentTest {
	static WebDriver driver;
	static ExtentReports report;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobhit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dawaghar.in/");
		
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Shobhit Reports");
		reporter.config().setDocumentTitle("Shobhit Automation");
		 report =new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester","Shobhit Maheshwari");
	}
	@Test
	public static void extent() {
		report.createTest("Inital Demo");
		//WebDriverManager.chromedriver().setup();
		System.out.println(driver.getTitle());
		report.flush();
	}

}
