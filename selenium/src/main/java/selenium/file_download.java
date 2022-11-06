package selenium;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

public class file_download {


	WebDriver driver;
	File Folder;
	String download_path=System.getProperty("user.dir") + "\\chrome download";

	@BeforeMethod
	public void set_up()
	{
		Folder = new File(download_path);
		Folder.mkdir();

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();

		Map<String, Object> prefs=new HashMap<String, Object>();

		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", Folder.getAbsolutePath());

		option.setExperimentalOption("prefs", prefs);

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, option);

		driver = new ChromeDriver();
	}
}


