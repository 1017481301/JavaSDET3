package test_app.wework.page;

import org.openqa.selenium.By;

public class Wework extends BasePage{
    public Wework() {
        super("com.tencent.wework", ".launch.LaunchSplashActivity");
    }

    public 日程Page 日程(){
        click(By.xpath("//*[@text='日程']"));
        return new 日程Page(driver);
    }

    public 待办Page to待办(){
        //这是个坑，text会变
        //click(By.xpath("//*[@text='待办']"));
        click(By.id("gwu"));
        return new 待办Page(driver);
    }

    public 工作台Page to工作台(){
        click(By.xpath("//*[@text='工作台']"));
        return new 工作台Page(driver);
    }
}
