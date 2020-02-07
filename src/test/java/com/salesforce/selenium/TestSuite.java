package com.salesforce.selenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestSuite extends BaseClass  {
    @Test
    public void logIn()
    {
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());
    }
}
