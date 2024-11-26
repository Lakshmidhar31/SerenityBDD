package starter.actions.search;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class SetTheSlider extends PageObject {
    WebElement slider;
    WebElement textBox;

    @Step("Scrolling to the slider element")
    public void scrollToSlider() {
        slider = $("//span[@data-index='0']");
        waitFor(ExpectedConditions.visibilityOf(slider));
        withAction().moveToElement(slider);
    }

    @Step("Moving the slider to 820")
    public void performRevCalc(){
        Actions moveSlider = new Actions(getDriver());
        moveSlider.dragAndDropBy(slider, 94, 0).build().perform();
    }

    @Step("Set the revCalc Text")
    public String getRevValue() {
        textBox = $("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']");
        waitFor(ExpectedConditions.visibilityOf(textBox));
        return textBox.getAttribute("value");
    }
}