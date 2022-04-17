package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class ACScreen extends BasePageObject {
    private By calculator(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Calculator\"]");
    }

    private By theNumbers(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"8\"]");
    }

    private By AcOperation(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"AC\"]");
    }

    @Step
    public boolean isOnCalculatorPage(){
        return calculator().equals("Calculator");
    }

    @Step
    public void clickTheNumbers(){
        onClick(theNumbers());
    }

    @Step
    public void clickAcOperation(){
        onClick(AcOperation());
    }

}
