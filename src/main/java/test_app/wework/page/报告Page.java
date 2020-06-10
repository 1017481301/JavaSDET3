package test_app.wework.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class 报告Page extends BasePage{

    private final By textWork = By.xpath("//android.widget.EditText[1]");   //今日工作，本周工作，本月工作文本框
    private final By textPlan = By.xpath("//android.widget.EditText[2]");   //计划文本框
    private final By textOther = By.xpath("//android.widget.EditText[3]");  //其他文本框
    private final By commit = By.xpath("//android.view.View[@content-desc=\"提交\"]");   //提交按钮
    private final By confirm = byText("确定");   //弹框提示的确定按钮

    public 报告Page(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public 报告详情Page to报告详情Page(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new 报告详情Page(driver);
    }

    public 报告Page add(String work, String plan, String other){
        sendKeys(textWork, work);
        sendKeys(textPlan, plan);
        sendKeys(textOther, other);
        swipeDown();
        click(commit);
        click(confirm);
        return this;
    }


}
