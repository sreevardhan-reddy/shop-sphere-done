import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) {
        // Assuming your web application is running on localhost at port 8080
        String url = "http://localhost:8000";

        // Set the path to the Chrome WebDriver
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\sreev\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();

        String pageContent = driver.getPageSource();
        System.out.println("Page Content:");
        System.out.println(pageContent);

        // driver.quit();
    }
}
