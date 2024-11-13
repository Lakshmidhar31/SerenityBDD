package starter.actions.navigation;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class SearchKeyword extends UIInteractions {
    @Step("Entering '{0}' into the input field")
    public void searchText(String keyword){
        $(".gLFyf").sendKeys(keyword, Keys.ENTER);
    }
}