package stepdefinitions;

import io.cucumber.spring.CucumberContextConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class TestDriverContext {
    WebDriver driver;

    public TestDriverContext() {
        init();
    }

    private void init() {
        WebDriverManager.chromedriver().driverVersion("121.0.6167.85").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    public WebDriver getDriver() {
        if(driver == null) {
            init();
        }
        return driver;
    }

    public void closeAndQuit() {
        driver.close();
        driver.quit();
        driver = null;
    }
}
