package testcases;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class UAMP extends BaseClass {

    @Test
    public void testmusicapp() throws InterruptedException {
        ObjectRepository or=new ObjectRepository(driver);
          Thread.sleep(2000);
        or.GenresButton.click();
        Thread.sleep(2000);
        //com.instantappsample.uamp:id/description
        MobileElement cinematic = (MobileElement) or.CinematicType;
        System.out.println(cinematic.getText());
        cinematic.click();
        Thread.sleep(2000);
        MobileElement songname=(MobileElement) or.SongName;
        System.out.println(songname.getText());
        songname.click();
        System.out.println("Enjoy the song");
    }
}
