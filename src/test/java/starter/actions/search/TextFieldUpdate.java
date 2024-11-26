package starter.actions.search;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TextFieldUpdate extends PageObject {
    WebElement textBox;
    WebElement slider;

    @Step("Scrolling to the slider element")
    public void scrollToTextBox() {
        evaluateJavascript("window.scrollTo(0, 400)");
    }

    @Step("Entering 560 to the input field")
    public void enterValueToTheField() throws InterruptedException {
        textBox = $("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div/div/input");
        waitFor(ExpectedConditions.elementToBeClickable(textBox));
        textBox.sendKeys("560");
        System.out.println(textBox.getText());
    }

    @Step("Validating the slider to be 560")
    public String validateSlider(){
        slider =  $("//input[@data-index='0']");
        waitFor(ExpectedConditions.visibilityOf(slider));
        return slider.getAttribute("value");
    }
}