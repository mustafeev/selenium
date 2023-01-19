public class CallBackTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll() {
        System.setProperty("Webdriver.chrome.driver". "C:\\Users\\Vadim\\IdeaProjects\\Selenium\\driver\\wing")
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }
    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }
    @Test
    void shouldTestSomething() {
        throw new UnsupportedOperationException();
    }
}
