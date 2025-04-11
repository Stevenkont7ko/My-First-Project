package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args){

        System.out.println("Adding more lines for practice");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();

    }
}
