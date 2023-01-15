package com.memburg

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest

open class BaseTest {
    private val url = "https://duolingo.com/"
    var driver: WebDriver? = null

    @BeforeTest
    fun setupWebDriver() {
        WebDriverManager.firefoxdriver().setup()
        this.driver = FirefoxDriver()
        this.driver!!.get(url)
    }

    @AfterTest
    fun tearDown() {
        Thread.sleep(5000)
        this.driver!!.quit()
    }
}