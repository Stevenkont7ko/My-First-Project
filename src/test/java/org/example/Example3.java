package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {
    public static void main(String[] args){
        System.out.println("Another test file 3");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chromatechacademy.net/selenium-practice/";

        driver.get(url);

        driver.quit();

    }
}
