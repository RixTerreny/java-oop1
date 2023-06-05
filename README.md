# Java Exercises: Java Shop and Java Bank

This repository contains two Java exercises: Java Shop and Java Bank. These exercises focus on object-oriented programming concepts and demonstrate the implementation of classes, constructors, access modifiers, getters, setters, and other methods.

## Java Shop

The Java Shop exercise is located in the `org.lessons.java.shop` package. It includes the following components:

### Prodotto Class

The `Prodotto` class represents a product in the shop. Each product has the following attributes:

- `code` (integer): Represents the product code.
- `name` (string): Represents the product name.
- `descriprion` (string): Represents the product description.
- `price` (double): Represents the product price without VAT.
- `VAT` (double): Represents the product VAT.

The class implements appropriate access levels (public and private), constructors, getters, setters, and other service methods to achieve the following functionality:

- The product code is set with a random number upon creation.
- The product code can only be accessed for reading.
- Other attributes can be accessed for both reading and writing.
- The product exposes a method to get the base price and another method to get the price including VAT.
- The product exposes a method to get the extended name by concatenating the code and name.

### Main Class

The `Main` class, also located in the `org.lessons.java.shop` package, contains the `main` method. This class is used to test all the functionalities of the `Prodotto` class.

## Java Bank

The Java Bank exercise is located in the `org.lessons.java.bank` package. It includes the following components:

### Conto Class

The `Conto` class represents a bank account. Each account has the following attributes:

- `bankAccountNumber` (integer): Represents the account number.
- `accountantName` (string): Represents the account owner's name.
- `balance` (double): Represents the account balance.

The class implements appropriate access levels (public and private), constructors, getters, setters, and other service methods to achieve the following functionality:

- The account balance is set to 0€ upon creation.
- The account number can only be accessed for reading.
- The account owner's name can be accessed for both reading and writing.
- The account balance can only be accessed for reading.
- There are methods to deposit and withdraw money from the account (note: the balance cannot become negative).
- Additional methods are provided to return the account information and the formatted balance.

### Bank Class

The `Bank` class, located in the same package `org.lessons.java.bank`, contains the `main` method. This class interacts with the user, generating a bank account with a random account number (from 1 to 1000) and the user's name. It presents a menu to the user with three options: deposit money, withdraw money, or exit. After the user selects an option, they are prompted to enter the amount of money to deposit or withdraw. The operation is performed on the account, and if it is valid, the current balance is displayed. The menu continues to appear until the user chooses to exit.

## Getting Started

To run these Java exercises, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/java-exercises.git`
2. Open the project in your preferred Java IDE.
3. Navigate to the respective packages (`org.lessons.java.shop` and `org.lessons.java.bank`) to find the main classes.
4. Run the `Main` classes to test
