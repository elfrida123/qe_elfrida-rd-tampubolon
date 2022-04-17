package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class PerkalianScreen extends BasePageObject {
    private By calculatorMultiplication(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Calculator\"]");
    }

    private By Number1(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"9\"]");
    }

    private By multiplicationOperation(){
        return MobileBy.xpath("//android.view.View[@content-desc=\" x \"]");
    }

    private By Number2(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"4\"]");
    }

    private By equalOperationMultiplication(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"=\"]");
    }

    @Step
    public boolean isOnCalculatorPageMultiplication(){
        return calculatorMultiplication().equals("Calculator");
    }

    @Step
    public void clickNumber1(){
        onClick(Number1());
    }

    @Step
    public void clickMultiplicationOperation(){
        onClick(multiplicationOperation());
    }

    @Step
    public void clickNumber2(){
        onClick(Number2());
    }

    @Step
    public void clickEqualOperationMinus(){
        onClick(equalOperationMultiplication());
    }

}
