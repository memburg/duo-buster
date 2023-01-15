package com.memburg.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class MainPage(private val driver: WebDriver) {
    private val buttonAlreadyHaveAnAccount = By.xpath("//span[contains(text(), 'I ALREADY HAVE AN ACCOUNT')]")
    private val inputEmail = By.xpath("//input[@data-test='email-input']")
    private val inputPassword = By.xpath("//input[@data-test='password-input']")

    fun performLogin() {
        driver.findElement(buttonAlreadyHaveAnAccount).click()
        driver.findElement(inputEmail).sendKeys("email@email")
        driver.findElement(inputPassword).sendKeys("duoplz123..")
    }
}