package starter.actions.search;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageComponent;

public class GetRes extends PageComponent {
    @Step("Finding the '{0}' in the webpage'")
    public String fetcher(String field){
        return $("//span[text()='"+field+"']/following-sibling::span").getText();
    }
}
