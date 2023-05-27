package Utilities;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebElement;

public class WinCommands {
    public static WindowsDriver driver;

    public WebElement getWebelementByName(String name)
    {
        WebElement element =WinCommands.driver.findElementByName(name);
        return element;
    }
    public void clickName( String name)
    {
        WebElement ele = this.getWebelementByName(name);
        ele.click();
    }
    public WebElement AutomationId(String id)
    {
        WebElement element = WinCommands.driver.findElementByAccessibilityId(id);
        return element;
    }
    public void ClickAutomationID(String id)
    {
        WebElement ele = this.AutomationId(id);
        ele.click();
    }
    public void delayScript(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
        }
    }
    public String gettext(String id) {
        WebElement ele=this.AutomationId(id);
        String text = ele.getText();
        return text;
    }
}
