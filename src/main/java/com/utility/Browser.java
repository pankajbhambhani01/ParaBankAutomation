package com.utility;

import com.constants.Constants;
import com.sun.org.apache.bcel.internal.classfile.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Browser {
    private WebDriver driver;

    public WebDriver getDriver() {
        return this.driver;
    }

    public void launch() {
        if (Constants.browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", Constants.pathMainResources + "exe/chrome_exe/chromedriver.exe");
            this.driver = new ChromeDriver();
        } else if (Constants.browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.firefox.driver", Constants.pathMainResources + "exe/firefox_exe/firefox.exe");
            this.driver = new FirefoxDriver();
        } else if (Constants.browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", Constants.pathMainResources + "exe/ie_exe/ie.exe");
            this.driver = new InternetExplorerDriver();
        } else if (Constants.browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", Constants.pathMainResources + "exe/edge_exe/edge.exe");
            this.driver = new EdgeDriver();
        } else if (Constants.browser.equalsIgnoreCase("chromeGrid")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            try {
                this.driver = new RemoteWebDriver(new URL("http://192.168.1.11:4444/wd/hub"), cap);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void maximize() {
        this.driver.manage().window().maximize();
    }

    public void navigateUrl(String url) {
        this.driver.get(url);
    }

    public void close() {
        this.driver.close();
        this.driver.quit();
    }
}
