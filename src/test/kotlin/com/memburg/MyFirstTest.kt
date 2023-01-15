package com.memburg

import com.memburg.pages.MainPage
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class MyFirstTest: BaseTest() {
    private lateinit var mainPage: MainPage

    @Test
    fun openWebDriver() {
        mainPage.performLogin()
    }

    @BeforeTest
    fun setupPages() {
        mainPage = MainPage(driver!!)
    }
}