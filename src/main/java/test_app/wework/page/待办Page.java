package test_app.wework.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class 待办Page extends BasePage{

    private final By todoName = By.id("b2k");
    private final By save = byText("保存");
    private final By todoList = By.id("gw9");
    private By add =By.id("gym");

    public 待办Page(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public 待办Page 添加(String name, String participants, String remindMe){
        click(add);
        sendKeys(todoName, name);
        click(save);
        return this;
    }

    public List<String> 获取待办(){
        return driver.findElements(todoList).stream().map(x->x.getText()).collect(Collectors.toList());
    }
}
