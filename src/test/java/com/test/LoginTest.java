package com.test;

import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "loginData", dataProviderClass = ExcelDataProvider.class)
    public void login(String username, String password) {
        System.out.println("Username: " + username + ", Password: " + password);
    }
}
