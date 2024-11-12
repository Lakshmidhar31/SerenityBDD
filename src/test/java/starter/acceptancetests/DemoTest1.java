package starter.acceptancetests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.actions.navigation.NavigatingURL;
import starter.actions.navigation.SearchClass;
import starter.actions.search.FetchResult;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@ExtendWith(SerenityJUnit5Extension.class)
public class DemoTest1 {
    @Managed(driver = "chrome")
    WebDriver driver;

    NavigatingURL navigatingURL;
    SearchClass searchClass;
    FetchResult fetchResult;
    @Test
    public void openYoutube(){
        navigatingURL.openDuckDuckGo();
        searchClass.searchKeyWord("Cucumber");
        Serenity.reportThat("The keyword should appear in the sidebar heading",
        () -> assertThat(fetchResult.fetcher(), is(equalTo("Cucumber"))));
//        Assertions.assertEquals("Cucumber", fetchResult.fetcher());
    }
}
