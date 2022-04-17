package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class CrossScreen extends BasePageObject {
    private By calculatorCross(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Calculator\"]");
    }

    private By firstNumber(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"8\"]");
    }

    private By secondNumber(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"9\"]");
    }

    private By crossOperator(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"⌫\"]");
    }

    private By ResultCross(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"8\"]");
    }

    @Step
    public boolean isOnCalculatorPageCross(){
        return calculatorCross().equals("Calculator");
    }

    @Step
    public void clickFirstNumber(){
        onClick(firstNumber());
    }

    @Step
    public void clickSecondNumber(){
        onClick(secondNumber());
    }

    @Step
    public void clickCrossOperation(){
        onClick(crossOperator());
    }

    @Step
    public void getResultCross(){
        onClick(ResultCross());
    }
}
