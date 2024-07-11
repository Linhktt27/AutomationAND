package RunApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Setting {

    public static AppiumDriver driver;
    public static AppiumDriver setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.22.3");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("deviceName", "emulator-5554");
        //capabilities.setCapability("app", "D://demoautotest//automobileand//src//test//resources//smogoliveqltb.apk");
        capabilities.setCapability("appPackage", "vn.com.vpbs.smartone.test");
        capabilities.setCapability("appActivity", "com.vpbs.smartone.ui.splash.SplashActivity");
        return new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    public static void tearDown(AppiumDriver driver) throws Exception{
        driver.quit();
    }
}
