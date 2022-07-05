import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Tests{

    static DesiredCapabilities cap;
    public AndroidDriver driver;
    public TouchAction touchAction;
    public static void main(String[] args)
    {
    }

    @BeforeSuite
    public void preparationTests()throws MalformedURLException {

        //подготовка драйвера для работы с Android
        cap = new DesiredCapabilities();
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\a0908\\Downloads\\2f9a9e0c-8230-4e33-9d14-a9989f9ac032.apk");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        touchAction = new TouchAction(driver);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test(priority=1)
    public void RestoringWalletWithoutSettingPinCode() {
        driver.findElementByAndroidUIAutomator("UiSelector().text(\"I have a wallet\")").click();
        touchAction.tap(TapOptions.tapOptions()
                        .withElement(ElementOption.element(driver.findElementByAndroidUIAutomator("UiSelector().text(\"PASTE\")"))))
                .perform();
        StringSelection stringSelection = new StringSelection("october prepare work slot panel toy minimum section boat snow scale powder");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
        driver.pressKey(new KeyEvent(AndroidKey.PASTE));
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button").click();
        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Setup passcode later\")").click();
        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Let’s start\")").click();
        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Home\")");
    }

    @Test(priority=2)
    public void NavigatingNavigationBar(){
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView").isDisplayed();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView[1]").isDisplayed();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView[1]").isDisplayed();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView").isDisplayed();
    }

    @Test(priority=3)
    public void OpenWalletTabOnHomeScreen(){
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.Button").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.TextView").isDisplayed();
        Assert.assertTrue(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[2]/android.view.View[2]/android.widget.TextView[1]").getText() == "Dai", "Не нашли валюту Dai");
        Assert.assertTrue(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[2]/android.view.View[3]/android.widget.TextView[1]").getText() == "Tether", "Не нашли валюту Tether");
        Assert.assertTrue(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[2]/android.view.View[4]/android.widget.TextView[1]").getText() == "Tether", "Не нашли валюту Tether");
        Assert.assertTrue(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[2]/android.view.View[5]/android.widget.TextView[1]").getText() == "Dai", "Не нашли валюту Dai");
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]").click();
    }

    @Test(priority=4)
    public void Logout(){
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.view.View[9]").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button").isDisplayed();
    }
}
