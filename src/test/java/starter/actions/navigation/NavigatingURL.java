package starter.actions.navigation;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigatingURL extends UIInteractions {
    @Step("Navigate to the Home Page")
    public void openDuckDuckGo(){
        openUrl("https://duckduckgo.com/");
    }
}
