package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Nova fascikla\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement fullNameTextField = driver.findElement(By.id("userName"));
        fullNameTextField.sendKeys("Nemanja Avric");
        WebElement emailTextField = driver.findElement(By.id("userEmail"));
        emailTextField.sendKeys("avricnemanja7@gmail.com");
        WebElement currentAddressTextField = driver.findElement(By.id("currentAddress"));
        currentAddressTextField.sendKeys("Puskinova 15");
        WebElement permanentAddresTextField = driver.findElement(By.id("permanentAddress"));
        permanentAddresTextField.sendKeys("Njegoseva 72");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        WebElement fullName = driver.findElement(By.id("name"));
        WebElement email = driver.findElement(By.id("email"));
        if (fullName.getText().contains(fullNameTextField.getText()) && email.getText().contains(emailTextField.getText())) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}