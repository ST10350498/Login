# Login System Documentation

## Overview
This Java application provides a user registration and login system with validation for usernames, passwords, and South African cellphone numbers. The system ensures secure registration and authentication processes.

## Features

- **User Registration**:
  - Validates username format (must contain '_' and be ≤5 characters)
  - Validates password complexity (≥8 chars, 1 capital letter, 1 number, 1 special ch# Login System Documentation

## Overview
This Java application provides a user registration and login system with validation for usernames, passwords, and South African cellphone numbers. The system ensures secure registration and authentication processes.

## Features

- **User Registration**:
  - Validates username format (must contain '_' and be ≤5 characters)
  - Validates password complexity (≥8 chars, 1 capital letter, 1 number, 1 special character)
  - Validates South African cellphone format (+27 followed by 9 digits)
  - Stores first and last name

- **User Login**:
  - Authenticates users against registered credentials
  - Provides multiple attempts for failed logins
  - Displays personalized welcome message upon successful login

## Code Structure
The system consists of two main classes:

1. **Login.java** - Contains the main application logic and user interface
2. **LoginTest.java** - Handles validation, registration, and authentication logic

## Validation Rules
| Field        | Validation Rule                                                                 |
|--------------|---------------------------------------------------------------------------------|
| Username     | Must contain '_' and be ≤5 characters (e.g., "user_")                          |
| Password     | ≥8 characters, at least 1 capital letter, 1 number, and 1 special character    |
| Cellphone    | Must start with +27 followed by exactly 9 digits (e.g., +27821234567)          |

## How to Use
1. Run the `Login` class
2. Follow the registration prompts:
   - Enter a valid username
   - Create a secure password
   - Provide a valid South African cellphone number
   - Enter your first and last name
3. After successful registration, log in with your credentials
4. You'll receive a personalized welcome message upon successful login

## Technical Details
- Uses regular expressions for pattern matching
- Implements input validation with informative error messages
- Stores user data in memory 
- Follows secure password practices

https://www.youtube.com/watch?v=p8bZBvcFPuk
aracter)
  - Validates South African cellphone format (+27 followed by 9 digits)
  - Stores first and last name

- **User Login**:
  - Authenticates users against registered credentials
  - Provides multiple attempts for failed logins
  - Displays personalized welcome message upon successful login

## Code Structure
The system consists of two main classes:

1. **Login.java** - Contains the main application logic and user interface
2. **LoginTest.java** - Handles validation, registration, and authentication logic

## Validation Rules
| Field        | Validation Rule                                                                 |
|--------------|---------------------------------------------------------------------------------|
| Username     | Must contain '_' and be ≤5 characters (e.g., "user_")                          |
| Password     | ≥8 characters, at least 1 capital letter, 1 number, and 1 special character    |
| Cellphone    | Must start with +27 followed by exactly 9 digits (e.g., +27821234567)          |

## How to Use
1. Run the `Login` class
2. Follow the registration prompts:
   - Enter a valid username
   - Create a secure password
   - Provide a valid South African cellphone number
   - Enter your first and last name
3. After successful registration, log in with your credentials
4. You'll receive a personalized welcome message upon successful login

## Technical Details
- Uses regular expressions for pattern matching
- Implements input validation with informative error messages
- Stores user data in memory 
- Follows secure password practices

## Reference 
Chegg, 2020. *How to Cite a YouTube Video in APA Style | Chegg*. [video online] Available at: <https://www.youtube.com/watch?v=p8bZBvcFPuk> [Accessed 22 April 2025].
