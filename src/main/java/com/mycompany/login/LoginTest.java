package com.mycompany.login;

import java.util.regex.Pattern;

public class LoginTest {
    private String username;
    private String password;
    private String cellNumber;
    private String firstName;
    private String lastName;
    private boolean isRegistered = false;

    private static final String CELL_PHONE_REGEX = "^\\+27\\d{9}$";
    private static final String USERNAME_REGEX = "^(?=.*_)[a-zA-Z_]{1,5}$";
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    public boolean checkUserName(String username) {
        return Pattern.matches(USERNAME_REGEX, username);
    }

    public boolean checkPasswordComplexity(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    public boolean checkCellPhoneNumber(String cellNumber) {
        return Pattern.matches(CELL_PHONE_REGEX, cellNumber);
    }

    public void registerUser(String username, String password, String cellNumber, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isRegistered = true;
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return isRegistered && enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    public String returnLoginStatus(boolean loginSuccess) {
        return loginSuccess 
                ? String.format("Welcome %s, %s It is great to see you again.", firstName, lastName)
                : "Username or password incorrect, please try again.";
    }
}