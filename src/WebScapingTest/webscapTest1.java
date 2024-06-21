package WebScapingTest;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class webscapTest1 {
	
	private static final int MAX_WAIT_TIME = 10;
    private static final int SLEEP_TIME = 5;

    public static void main(String[] args) {
        String url = "https://cricheroes.in/scorecard/8397977/individual/Tridhya-Spartans-vs-Tridhya-Warriors";

        try (WebDriver driver = new ChromeDriver()) {
            driver.get(new URL(url));

            WebDriverWait wait = new WebDriverWait(driver, MAX_WAIT_TIME);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("scorecardTab")));
            button.click();

            // Wait for the table to load
            Thread.sleep(SLEEP_TIME);

            Document document = driver.getPageSource();
            Element table = findTable(document, "table-propeller3");

            if (table != null) {
                NodeList trList = table.getElementsByTagName("tr");
                int headerRowIndex = -1;
                for (int i = 0; i < trList.getLength(); i++) {
                    Element tr = (Element) trList.item(i);
                    if (tr.getAttribute("class").equals("table-header")) {
                        headerRowIndex = i;
                        break;
                    }

}
