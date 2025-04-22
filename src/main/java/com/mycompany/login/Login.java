package com.mycompany.login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginTest loginSystem = new LoginTest();
        
        System.out.println("=== REGISTRATION ===");
        
        // Username input with validation
        String username;
        while (true) {
            System.out.print("Username (must contain '_' and be ≤5 characters): ");
            username = scanner.nextLine();
            if (loginSystem.checkUserName(username)) {
                break;
            }
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
        }
        
        // Password input with validation
        String password;
        while (true) {
            System.out.print("Password (≥8 chars, 1 capital, 1 number, 1 special char): ");
            password = scanner.nextLine();
            if (loginSystem.checkPasswordComplexity(password)) {
                break;
            }
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }
        
        // Cellphone input with validation
        String cellphone;
        while (true) {
            System.out.print("SA cellphone (+27 followed by 9 digits): ");
            cellphone = scanner.nextLine();
            if (loginSystem.checkCellPhoneNumber(cellphone)) {
                break;
            }
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }
        
        // First and last name (no validation needed)
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        
        // Register user
        loginSystem.registerUser(username, password, cellphone, firstName, lastName);
        System.out.println("User registered successfully.");
        
        // Login process with retry on failure
        System.out.println("\n=== LOGIN ===");
        boolean loginSuccess;
        do {
            System.out.print("Username: ");
            String loginUsername = scanner.nextLine();
            System.out.print("Password: ");
            String loginPassword = scanner.nextLine();
            
            loginSuccess = loginSystem.loginUser(loginUsername, loginPassword);
            if (!loginSuccess) {
                System.out.println("Username or password incorrect, please try again.");
            }
        } while (!loginSuccess);
        
        System.out.println(loginSystem.returnLoginStatus(true));
        
        scanner.close();
    }
}