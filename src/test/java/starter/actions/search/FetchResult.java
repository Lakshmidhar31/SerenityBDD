package starter.actions.search;

import net.serenitybdd.core.pages.PageComponent;

public class FetchResult extends PageComponent {

    public String fetcher(){
        return $("//h2[text()='Cucumber']").getText();
    }
}
