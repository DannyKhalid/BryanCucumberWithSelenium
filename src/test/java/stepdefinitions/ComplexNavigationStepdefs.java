package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ComplexNavigationStepdefs {
    TestDriverContext testDriverContext;

    ComplexNavigationStepdefs(TestDriverContext testDriverContext) {
        this.testDriverContext = testDriverContext;
    }

    @Given("I have a browser open to {string}")
    public void iHaveABrowserOpenTo(String url) {
        testDriverContext.getDriver().get(url);
    }

    @When("Find the element by id {string}")
    public void findTheElementById(String elementId) {
        WebElement element = testDriverContext.getDriver().findElement(By.id(elementId));
        element.click();
    }

    @Then("I see the test {string} page")
    public void iSeeTheTestPage(String pageTitle) {
        String tabTitle = testDriverContext.getDriver().getTitle();
        Assertions.assertTrue(tabTitle.contains(pageTitle));
    }

    @Then("I close the complex browser")
    public void iCloseTheComplexBrowser() {
        testDriverContext.closeAndQuit();
    }
}
