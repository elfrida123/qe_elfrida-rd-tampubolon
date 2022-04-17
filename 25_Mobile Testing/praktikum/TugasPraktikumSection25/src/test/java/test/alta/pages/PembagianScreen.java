package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class PembagianScreen extends BasePageObject {
    private By calculator(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Calculator\"]");
    }

    private By firstNumber(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"8\"]");
    }

    private By divideOperation(){
        return MobileBy.xpath("//android.view.View[@content-desc=\" ÷ \"]");
    }

    private By secondNumber(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"2\"]");
    }

    private By equalOperation(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"=\"]");
    }

    private By Result(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"4\"]");
    }

    @Step
    public boolean isOnCalculatorPage(){
        return calculator().equals("Calculator");
    }

    @Step
    public void clickFirstNumber(){
        onClick(firstNumber());
    }

    @Step
    public void clickDivideOperation(){
        onClick(divideOperation());
    }

    @Step
    public void clickSecondNumber(){
        onClick(secondNumber());
    }

    @Step
    public void clickEqualOperation(){
        onClick(equalOperation());
    }

    @Step
    public void getResult(){
        onClick(Result());
    }
}
