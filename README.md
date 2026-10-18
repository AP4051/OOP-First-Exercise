# ☕ Java Object-Oriented Programming (OOP) Exercises

A hands-on collection of progressive programming exercises to master **Object-Oriented Programming (OOP)** in Java.

This repository covers key object-oriented principles:
- **Classes & Objects**: State, behavior, and lifecycle.
- **Encapsulation**: Access modifiers, data integrity, and defensive design.
- **Inheritance & Polymorphism**: Code reuse, dynamic dispatch, and interface/superclass abstraction.
- **Object Composition & System Design**: Building multi-class domain models and package architectures.

---

## 📑 Table of Contents
1. [Exercise 1 : Personal Bank Account System](#-exercise-1-easy-personal-bank-account-system)
2. [Exercise 2 : Employee & Payroll System](#-exercise-2-medium-employee--payroll-system)
3. [Exercise 3 : E-Commerce Order & Inventory System](#-exercise-3-hard--project-e-commerce-order--inventory-system)
4. [Evaluation Rubric & Best Practices](#-evaluation-rubric)

---

## 🟢 Exercise 1 : Personal Bank Account System

### 🎯 Objective
Learn the fundamentals of class definition, object instantiation, constructor initialization, and apply **strict Encapsulation** to protect internal state.

### 📁 Suggested Project Structure
```text
exercise-1-bank-account/
└── src/
    ├── BankAccount.java
    └── Main.java
```

### 📋 Problem Statement & Requirements
You are asked to model a simple bank account with strict security rules around money handling.

#### Core Specifications:
1. **State & Visibility**:
   - Each account must track an `accountNumber` (String), `ownerName` (String), and `balance` (double).
   - All fields **must be private**. No external code should be able to alter the balance directly.
   - The `accountNumber` should be immutable once created (read-only).

2. **Initialization**:
   - Provide a constructor that sets up the account with an account number, owner name, and starting balance.
   - **Constraint**: If an initial balance less than zero is provided, set the balance to `0.0` and notify the user with an appropriate message.

3. **Behavior & Invariants (Encapsulation)**:
   - Provide standard getter methods.
   - For `ownerName`, allow updates through a setter only if the provided name is valid (non-null and not blank).
   - Provide controlled transaction methods instead of a raw `setBalance`:
     - `deposit(double amount)`: Accepts strictly positive values (`amount > 0`). Rejects zero or negative amounts.
     - `withdraw(double amount)`: Validates that the amount is positive and does not exceed the current balance. If funds are insufficient, reject the operation and show an error.
   - `displayAccountInfo()`: Prints a clear summary of the account details and current balance.

### 🧪 Verification & Test Scenario (`Main.java`)
Write a `main` method that verifies your encapsulation and business rules:
- Create an account with a starting balance of `$1,000`.
- Attempt invalid operations (e.g., deposit negative money, withdraw more than the available balance) and verify they are rejected.
- Perform a valid deposit of `$500` and a valid withdrawal of `$300`.
- Print the account info to confirm the final balance matches `$1,200`.

---

## 🟡 Exercise 2 : Employee & Payroll System

### 🎯 Objective
Implement **Inheritance** (`extends`) and **Polymorphism**, leverage `super` for constructor chaining and method reuse, and handle diverse business rules across derived classes while maintaining encapsulation.

### 📁 Suggested Project Structure
```text
exercise-2-employee-system/
└── src/
    ├── Employee.java            # Base class
    ├── FullTimeEmployee.java    # Derived class
    ├── PartTimeEmployee.java    # Derived class
    └── Main.java                # Test runner
```

### 📋 Problem Statement & Requirements
A company needs a payroll system capable of managing multiple employment types under a common interface.

#### 1. Base Class: `Employee`
- Defines common employee data: `id`, `name`, and `baseSalary` (all `private`).
- Constructor initializes all base attributes safely.
- Provides getters and validated setters where appropriate.
- Defines a method `calculateSalary()` that returns the base salary.
- Defines `displayInfo()` to print employee identifiers and calculated earnings.

#### 2. Subclasses: Specialization via Inheritance
- **`FullTimeEmployee`**:
  - Represents salaried staff with additional benefits (e.g., performance bonus and healthcare allowance).
  - Uses `super(...)` to initialize base attributes.
  - Overrides `calculateSalary()` to compute earnings by factoring in base salary plus benefits.
- **`PartTimeEmployee`**:
  - Represents contractors paid by the hour (tracks `hoursWorked` and `hourlyRate`).
  - Uses `super(...)` properly.
  - Overrides `calculateSalary()` so that compensation is calculated solely from hours logged multiplied by the hourly rate.

> [!IMPORTANT]
> **Don't forget to maintain encapsulation!**
### 🧪 Verification & Test Scenario (`Main.java`)
Demonstrate **Polymorphism**:
- Create an array or collection of type `Employee` holding at least one general `Employee`, one `FullTimeEmployee`, and one `PartTimeEmployee`.
- Iterate through the collection in a single loop, invoking `displayInfo()` on each element.
- Calculate and display the grand total payroll that the company must pay across all employees.

---

## 🔴 Exercise 3 : E-Commerce Order & Inventory System

### 🎯 Objective
Design and implement a multi-package, object-oriented system that combines **Inheritance**, **Encapsulation**, **Composition**, and **Transaction Integrity**.

### 📁 Package & Directory Structure
```text
exercise-3-ecommerce-system/
└── src/
    ├── customer/
    │   └── Customer.java          # Customer profile & digital wallet
    ├── product/
    │   ├── Product.java           # Base product definition
    │   ├── PhysicalProduct.java   # Weight-based shipping logic
    │   └── DigitalProduct.java    # Discounted/license-based goods
    ├── order/
    │   ├── OrderItem.java         # Product reference & quantity
    │   └── Order.java             # Cart management & checkout logic
    └── Main.java                  # End-to-end integration test
```

---

### 📋 Architecture & Business Specifications

#### 1. Product Hierarchy (`product` package)
- **`Product` (Base Class)**:
  - Private fields: `id`, `name`, `price`, and `stockQuantity`.
  - Methods to safely increase and reduce stock. Stock must never fall below zero.
  - A method `calculateFinalPrice()` that returns the unit price (open for specialization in subclasses).
- **`PhysicalProduct`**:
  - Adds physical attributes (e.g., `weightKg`, `shippingRatePerKg`).
  - Overrides `calculateFinalPrice()`: Price includes base price plus shipping calculated from weight.
- **`DigitalProduct`**:
  - Adds digital attributes (e.g., `downloadUrl`, `fileSizeMb`, `discountPercentage`).
  - Overrides `calculateFinalPrice()`: Applies a percentage discount to the base price without shipping fees.

#### 2. Customer & Wallet Management (`customer` package)
- **`Customer`**:
  - Tracks customer ID, full name, email, and `walletBalance`.
  - Ensure the email is formatted reasonably (basic validation).
  - Encapsulate the wallet: provide `topUpWallet(double amount)` and `deductWallet(double amount)`.
  - Funds must not be deducted if the balance is insufficient.

#### 3. Order Processing & Transaction Integrity (`order` package)
- **`OrderItem`**:
  - Combines a `Product` reference with an ordered `quantity`.
  - Computes the subtotal for this item (`product.calculateFinalPrice() * quantity`).
- **`Order`**:
  - Contains an `orderId`, an associated `Customer`, a list of `OrderItem` objects, and an `isPaid` flag.
  - `addItem(Product product, int quantity)`: Ensures requested quantity does not exceed current stock before adding to cart.
  - `calculateTotalOrderCost()`: Computes total across all order items.
  - `checkout()`: **Must execute atomically**:
    1. Calculate the total cost of the order.
    2. Check if the customer has enough funds in their wallet.
    3. **If funds are sufficient**:
       - Deduct the total cost from the customer's wallet.
       - Decrement the stock of each product ordered.
       - Mark the order as paid.
       - Print a detailed receipt with item subtotals and final total.
    4. **If funds are insufficient**:
       - Reject the checkout with an explicit error message.
       - **State Safety**: Do NOT deduct any funds, and do NOT decrement any product stock!

> [!IMPORTANT]
> **Don't forget to maintain encapsulation!**
---

### 🧪 Verification & Test Scenario (`Main.java`)
Simulate a realistic lifecycle test:
1. Initialize physical products (e.g., Laptop) and digital products (e.g., Online Course).
2. Create a customer with a limited wallet balance (e.g., `$500`).
3. Build an order containing items whose total cost exceeds the customer's wallet (e.g., `$1,200`).
4. Attempt `checkout()`:
   - Verify that the transaction fails gracefully.
   - Confirm that product stock and the customer's wallet balance remained unchanged.
5. Deposit sufficient funds into the customer's wallet.
6. Re-run `checkout()`:
   - Verify that checkout succeeds.
   - Confirm receipt output.
   - Confirm the wallet was debited and product stock was reduced accordingly.

---

> 💡 **Tip for Learners**: Fork this repository, implement your solutions, and write modular, readable code!


---

## 🚀 Git Workflow Guide (Fork, Clone, Commit & Push)

Follow these steps to fork the repository, clone it locally, track your solutions, and submit your code.

### 1. Fork the Repository
Click the **Fork** button at the top-right corner of this GitHub repository page. This creates an independent copy of this project under your personal GitHub account.

---

### 2. Clone Your Fork
Open your terminal and clone **your forked repository** (replace `<your-username>` with your GitHub username):
```bash
# Clone your fork via HTTPS
git clone https://github.com/<your-username>/<repository-name>.git

# Navigate into the project directory
cd <repository-name>
```

---

### 3. Check Status & Stage Changes
After implementing the exercises, inspect your changes:
```bash
# View modified and untracked files
git status

# Stage specific files or folders
git add exercise-1-bank-account/

# Or stage all changes across the repository
git add .
```

---

### 4. Commit Your Work
Commit your staged changes with a concise, meaningful message:
```bash
# Commit with a clear description
git commit -m "feat: complete exercise 1 BankAccount with strict encapsulation"
```

---

### 5. Push to Your Fork
Send your commits up to the default (`main`) branch of your GitHub fork:
```bash
# Push directly to your main branch
git push origin main
```

> 💡 **Creating a Pull Request**: After pushing, visit the original repository on GitHub. Click **"Compare & pull request"** to open a PR from your fork into the original repository for review.
