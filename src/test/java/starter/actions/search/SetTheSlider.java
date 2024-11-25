package starter.actions.search;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

public class SetTheSlider extends PageObject {
    @Step("Scrolling to the slider element")
    public void scrollToSlider() {
        withAction().moveToElement(findBy(".css-16i48op"));
    }

    @Step("Moving the slider to 820")
    public void performRevCalc(){
        WebElement slider = $("//input[@data-index='0']");
        Actions moveSlider = new Actions(getDriver());
        moveSlider.dragAndDropBy(slider, 94, 0).build().perform();
    }

    @Step("Set the revCalc Text")
    public String getRevValue(){
//        WebElementFacade textField = $("//input[@id=':R57alklff9da:']");
//        return textField.waitUntilVisible().getText();
        return $("//input[@id=':R57alklff9da:']").waitUntilVisible().getValue();
    }
}