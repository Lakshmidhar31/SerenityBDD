package starter.acceptancetests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.actions.navigation.ClickRevCalc;
import starter.actions.navigation.NavigateGoogle;
//import starter.actions.navigation.SearchKeyword;
//import starter.actions.search.GetRes;
import starter.actions.search.SetTheSlider;
import starter.actions.search.TextFieldUpdate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@ExtendWith(SerenityJUnit5Extension.class)
public class FetchRev {

    @Managed(driver = "edge")
    WebDriver driver;

    @Steps
    NavigateGoogle navigateGoogle;
    @Steps
    ClickRevCalc clickRevCalc;
    @Steps
    SetTheSlider setTheSlider;
    @Steps
    TextFieldUpdate textFieldUpdate;

    @Test
    public void findRevenue() throws InterruptedException {
        driver.manage().window().maximize();
        navigateGoogle.navigateG();

        clickRevCalc.navigateToRevCalc();
        setTheSlider.scrollToSlider();
        setTheSlider.performRevCalc();
        Serenity.reportThat("Output should match", () ->
                assertThat(setTheSlider.getRevValue(), is(equalTo("822"))));


    }

    @Test
    public void updateTextField() throws InterruptedException {
        driver.manage().window().maximize();

        navigateGoogle.navigateG();
        clickRevCalc.navigateToRevCalc();
        textFieldUpdate.scrollToTextBox();
        textFieldUpdate.enterValueToTheField();

        Serenity.reportThat("Output should match", () ->
                assertThat(textFieldUpdate.validateSlider(), is(equalTo("560"))));

    }
}
