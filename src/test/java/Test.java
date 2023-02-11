import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
        @org.junit.jupiter.api.Test
        public void webDriverTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ru/");
            WebElement searchInput = driver.findElement(By.name("q"));
            searchInput.sendKeys("Привет");
            WebElement startSearch = driver.findElement(By.name("btnK"));
            searchInput.click();
            Thread.sleep(3000);
            driver.quit();
    }
}
