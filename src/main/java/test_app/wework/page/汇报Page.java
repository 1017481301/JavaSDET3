package test_app.wework.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class 汇报Page extends BasePage{

    public 汇报Page(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public 报告Page to报告(String reportType){
        if (reportType == "日报" || reportType == "月报" || reportType == "周报")
        {
            click(By.xpath("//*[@text='" + reportType + "']"));
        }
        else
        {
            System.out.println("输入报告类型有误，请重新输入日报、月报或者周报");
        }
        return new 报告Page(driver);
    }

}
