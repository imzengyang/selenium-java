import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class BaiDuTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","src/main/webdriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testName() throws Exception {
//        driver.get("http://www.baidu.com");
        driver.navigate().to("http://www.baidu.com");

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }
}
