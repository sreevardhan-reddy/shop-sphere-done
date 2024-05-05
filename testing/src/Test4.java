import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test4 {

    public static void main(String[] args) {
        // Assuming your web application is running on localhost at port 8080
        String url = "http://localhost:8000";

        // Set the path to the Chrome WebDriver
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\sreev\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);


        WebElement nameInput = driver.findElement(By.id("name"));
        nameInput.sendKeys("Sree Vardhan");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("sree@example.com");

        WebElement messageInput = driver.findElement(By.id("message"));
        messageInput.sendKeys("Next time you should come with discounts!");

        WebElement submitButton = driver.findElement(By.id("feedbackButton"));
        submitButton.click();

        String pageContent = driver.getPageSource();
        System.out.println("Page Content:");
        System.out.println(pageContent);

        // driver.quit();
    }
}
