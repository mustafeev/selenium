import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {
    private OrderTest driver;

    @BeforeAll
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver",".C:/Users/Vadim/IdeaProjects/Selenium/driver/win/chromedriver.exe");
    }

    @BeforeEach
    void setUp() {
        driver = new OrderTest();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    private void quit() {
    }

    @Test
    void shouldTestSomething() {
        driver.get("http://localhost:9999/");
        driver.findElement().sendKeys("василий");

    }
}
