package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepository extends BaseClass {

    WebDriver driver;


    //Hook hook=new Hook;
    public ObjectRepository(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //**************************Genres Button**************
    @FindBy(how= How.ID,using="com.instantappsample.uamp:id/title")
    public WebElement GenresButton;
    //**************************Cinematic Type**************
    @FindBy(how= How.XPATH,using="/hierarchy/android.widget.FrameLayout/\" +\n" +
            "                \"android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/\" +\n" +
            "                \"android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/\" +\n" +
            "                \"android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/\" +\n" +
            "                \"android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")
    public WebElement CinematicType;
    //**************************Song Name**************
    @FindBy(how= How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/\" +\n" +
            "                \"android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/\" +\n" +
            "                \"android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/\" +\n" +
            "                \"android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/\" +\n" +
            "                \"android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]")
    public WebElement SongName;
}
