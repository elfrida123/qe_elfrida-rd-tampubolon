package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class PenambahanScreen extends BasePageObject {
    private By calculatorAdd(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Calculator\"]");
    }

    private By numberFirst(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"8\"]");
    }

    private By addOperation(){
        return MobileBy.xpath("//android.view.View[@content-desc=\" + \"]");
    }

    private By numberSecond(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"9\"]");
    }

    private By equalOperationAdd(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"=\"]");
    }

    private By Result(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"17\"]");
    }

    @Step
    public boolean isOnCalculatorPageAdd(){
        return calculatorAdd().equals("Calculator");
    }

    @Step
    public void clickNumberFirst(){
        onClick(numberFirst());
    }

    @Step
    public void clickAddOperation(){
        onClick(addOperation());
    }

    @Step
    public void clickNumberSecond(){
        onClick(numberSecond());
    }

    @Step
    public void clickEqualOperationAdd(){
        onClick(equalOperationAdd());
    }

    @Step
    public void getResultAdd(){
        onClick(Result());
    }
}
