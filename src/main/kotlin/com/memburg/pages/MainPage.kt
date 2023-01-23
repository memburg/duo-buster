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

    @FindBy(xpath = "//a[@href='/register'][@data-test='get-started-top']")
    private var buttonGetStarted: WebElement? = null
    
    @FindBy(xpath = "//button[contains(@data-test, 'language-de')]")
    private var buttonGermanCourse: WebElement? = null

    @FindBy(xpath = "//span[contains(text(), 'YouTube')]")
    private var buttonYouTubeRadio: WebElement? = null

    @FindBy(xpath = "//span[contains(text(), 'Continue')]")
    private var buttonContinue: WebElement? = null

    @FindBy(xpath = "//div[contains(text(), 'Family & Friends')]")
    private var buttonFamilyRadio: WebElement? = null

    @FindBy(xpath = "//span[contains(text(), 'Intense')]")
    private var buttonSeriousGoal: WebElement? = null

    @FindBy(xpath = "//button[@data-test='not-now']")
    private var buttonNotNow: WebElement? = null

    // @FindBy(xpath = "//button//img[@draggable='false']")
    // private var buttonLesson: WebElement? = null

    // @FindBy(xpath = "//a[contains(text(), 'Start')]")
    // private var startLesson: WebElement? = null

    private val wait = WebDriverWait(driver, Duration.ofSeconds(10))

    fun setInitialGoals() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonGetStarted!!))
        buttonGetStarted!!.click()

        wait.until(ExpectedConditions.elementToBeClickable(buttonGermanCourse!!))
        buttonGermanCourse!!.click()

        wait.until(ExpectedConditions.elementToBeClickable(buttonYouTubeRadio!!))
        buttonYouTubeRadio!!.click()

        wait.until(ExpectedConditions.elementToBeClickable(buttonContinue!!))
        buttonContinue!!.click()

        wait.until(ExpectedConditions.elementToBeClickable(buttonFamilyRadio!!))
        buttonFamilyRadio!!.click()

        wait.until(ExpectedConditions.elementToBeClickable(buttonContinue!!))
        buttonContinue!!.click()

        wait.until(ExpectedConditions.elementToBeClickable(buttonSeriousGoal!!))
        buttonSeriousGoal!!.click()

        wait.until(ExpectedConditions.elementToBeClickable(buttonContinue!!))
        buttonContinue!!.click()

        wait.until(ExpectedConditions.elementToBeClickable(buttonContinue!!))
        buttonContinue!!.click()

        wait.until(ExpectedConditions.elementToBeClickable(buttonNotNow!!))
        buttonNotNow!!.click()
    }

    // fun startFirstLesson() {
    //     wait.until(ExpectedConditions.elementToBeClickable(buttonLesson!!))
    //     buttonLesson!!.click()
    //     wait.until(ExpectedConditions.elementToBeClickable(startLesson!!))
    //     startLesson!!.click()
    // }
}