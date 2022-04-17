package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class PenguranganScreen extends BasePageObject {
    private By calculatorMinus(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Calculator\"]");
    }

    private By Number1(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"6\"]");
    }

    private By minusOperation(){
        return MobileBy.xpath("//android.view.View[@content-desc=\" - \"]");
    }

    private By Number2(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"3\"]");
    }

    private By equalOperationMinus(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"=\"]");
    }

    private By ResultMinus(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"3\"]");
    }

    @Step
    public boolean isOnCalculatorPageMinus(){
        return calculatorMinus().equals("Calculator");
    }

    @Step
    public void clickNumber1(){
        onClick(Number1());
    }

    @Step
    public void clickMinusOperation(){
        onClick(minusOperation());
    }

    @Step
    public void clickNumber2(){
        onClick(Number2());
    }

    @Step
    public void clickEqualOperationMinus(){
        onClick(equalOperationMinus());
    }

    @Step
    public void getResultMinus(){
        onClick(ResultMinus());
    }
}
