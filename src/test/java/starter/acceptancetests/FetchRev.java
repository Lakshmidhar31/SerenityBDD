package starter.acceptancetests;

import net.serenitybdd.annotations.Managed;
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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@ExtendWith(SerenityJUnit5Extension.class)
public class FetchRev {

    @Managed(driver = "edge")
    WebDriver driver;

    NavigateGoogle navigateGoogle;
    ClickRevCalc clickRevCalc;
    SetTheSlider setTheSlider;

    @Test
    public void findRevenue() throws InterruptedException {
        driver.manage().window().maximize();
        navigateGoogle.navigateG();

        clickRevCalc.navigateToRevCalc();
        setTheSlider.scrollToSlider();
        Thread.sleep(4000);
        setTheSlider.performRevCalc();
        Thread.sleep(4000);
        Assertions.assertEquals("822", setTheSlider.getRevValue());
    }
}
