package test_app.wework.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class 工作台Page extends BasePage{

    public 工作台Page(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    public 汇报Page to汇报(){
        swipeDown();
        click(By.xpath("//*[@text='汇报']"));
        return new 汇报Page(driver);
    }

}
