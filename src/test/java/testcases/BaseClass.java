package testcases;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    AndroidDriver driver=null;
    @BeforeClass
    public void beforescenario() throws MalformedURLException {
        DesiredCapabilities des=new DesiredCapabilities();
        //des.setCapability(MobileCapabilityType.AUTOMATION_NAME,"MusicApp");
        des.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        des.setCapability(MobileCapabilityType.DEVICE_NAME,"SM-N986B/DS");
        des.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
        des.setCapability(MobileCapabilityType.UDID,"R5CN81B8FFN");
        des.setCapability("appPackage","com.instantappsample.uamp");
        des.setCapability("appActivity","com.example.android.uamp.ui.MusicPlayerActivity");
        //des.setCapability(MobileCapabilityType.BROWSER_NAME,"CHROME");
        des.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver(url,des);
        des.setCapability(MobileCapabilityType.APP,"src/test/java/Apps/UAMPMusicPlayerApp.apk");
        System.out.println("Connected with the device");
    }

}
