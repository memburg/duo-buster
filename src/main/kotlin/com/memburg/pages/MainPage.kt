package com.memburg.pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class MainPage(private val driver: WebDriver) {
    init {
        PageFactory.initElements(driver, this)
    }

    private val wait = WebDriverWait(driver, Duration.ofSeconds(10))

    @FindBy(xpath = "//span[contains(text(), 'I ALREADY HAVE AN ACCOUNT')]")
    private var buttonAlreadyHaveAnAccount: WebElement? = null

    @FindBy(xpath = "//input[@data-test='email-input']")
    private var inputEmail: WebElement? = null

    @FindBy(xpath = "//input[@data-test='password-input']")
    private var inputPassword: WebElement? = null

    @FindBy(xpath = "//span[contains(text(), 'LOG IN')]")
    private var buttonLogIn: WebElement? = null

    fun performLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonAlreadyHaveAnAccount!!))
        buttonAlreadyHaveAnAccount!!.click()
        wait.until(ExpectedConditions.visibilityOf(inputEmail!!))
        inputEmail!!.sendKeys("email@email.com")
        wait.until(ExpectedConditions.visibilityOf(inputPassword!!))
        inputPassword!!.sendKeys("password123..")
        wait.until(ExpectedConditions.elementToBeClickable(buttonLogIn!!))
        buttonLogIn!!.click()
    }
}