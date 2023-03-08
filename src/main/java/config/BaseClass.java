package config;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
    public static AndroidDriver driver;

    @BeforeClass
    public static void b() {
        driver = DriverConfig.create(EMULATORS.PIXEL2610);
    }

    @AfterClass
    public static void a() throws InterruptedException {
        Thread.sleep(20000);
        driver.quit();
    }
}
