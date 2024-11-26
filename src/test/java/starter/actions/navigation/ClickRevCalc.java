package starter.actions.navigation;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickRevCalc extends PageObject {

    @Step("Navigating on to the Revenue Calculator")
    public void navigateToRevCalc(){
        $("//div[text()='Revenue Calculator']").click();
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));

    }
}
