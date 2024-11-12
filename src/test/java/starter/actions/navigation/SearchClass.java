package starter.actions.navigation;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class SearchClass extends UIInteractions {
    @Step("Entering '{0}' into the input field")
    public void searchKeyWord(String keyword){
        $("//div[@class='searchbox_searchbox__eaWKL']/input").sendKeys(keyword, Keys.ENTER);
    }
}
