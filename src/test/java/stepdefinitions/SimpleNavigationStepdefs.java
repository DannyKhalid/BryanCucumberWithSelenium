package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleNavigationStepdefs {

    TestDriverContext testDriverContext;

    SimpleNavigationStepdefs(TestDriverContext testDriverContext) {
        this.testDriverContext = testDriverContext;
    }

    @Given("I have a browser open")
    public void iHaveABrowserOpen() {

    }

    @When("I navigate to {string}")
    public void iNavigateTo(String url) {
        testDriverContext.getDriver().get(url);
    }

    @Then("I see the {string} page")
    public void iSeeThePage(String pageTitle) {
        String tabTitle = testDriverContext.getDriver().getTitle();
        Assertions.assertTrue(tabTitle.contains(pageTitle));
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() {
        testDriverContext.closeAndQuit();
    }
}
