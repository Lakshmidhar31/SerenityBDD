package starter.actions.navigation;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateGoogle extends UIInteractions {

    @Step("Navigated to Google")
    public void navigateG(){
        openUrl("https://www.google.com/");
    }
}
