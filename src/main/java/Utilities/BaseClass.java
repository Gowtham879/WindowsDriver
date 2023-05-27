package Utilities;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass extends WinCommands {
    public void OpenApplication() throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);
//        System.out.println(driver.getSessionId());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void CloseApplication() throws IOException {
        driver.quit();
    }
}