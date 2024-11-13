package starter.acceptancetests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.actions.navigation.NavigateGoogle;
import starter.actions.navigation.SearchKeyword;
import starter.actions.search.GetRes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@ExtendWith(SerenityJUnit5Extension.class)
public class FetchRev {

    @Managed(driver = "chrome")
    WebDriver driver;

    NavigateGoogle navigateGoogle;
    SearchKeyword searchKeyword;
    GetRes getRes;
    @Test
    public void findRevenue(){
        navigateGoogle.navigateG();
        searchKeyword.searchText("epam systems");
        Serenity.reportThat("Output should match", () -> assertThat(getRes.fetcher("Revenue"), is(equalTo("4.69 billion USD (2023)"))));
    }
}
