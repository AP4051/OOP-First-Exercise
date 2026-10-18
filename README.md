# ☕ Java Object-Oriented Programming (OOP) Exercises

A hands-on collection of progressive programming exercises to master **Object-Oriented Programming (OOP)** in Java.

This repository covers key object-oriented principles:
- **Classes & Objects**: State, behavior, and object lifecycle.
- **Encapsulation**: Access modifiers, data integrity, and defensive design.
- **Inheritance & Polymorphism**: Code reuse, dynamic dispatch, and superclass specialization.
- **Object Composition & System Design**: Building multi-class domain models and managing object interactions.

---

## 📑 Table of Contents
1. [Exercise 1: Personal Bank Account System](#-exercise-1-personal-bank-account-system)
2. [Exercise 2: Employee & Payroll System](#-exercise-2-employee--payroll-system)
3. [Exercise 3: Vehicle Rental Management System](#-exercise-3-vehicle-rental-management-system)
4. [Git Workflow Guide (Fork, Clone, Commit & Push)](#-git-workflow-guide-fork-clone-commit--push)

---

## 📌 Exercise 1: Personal Bank Account System

### 🎯 Objective
Learn how to define a class, instantiate objects, write constructors, and apply **strict Encapsulation** so that an object's internal data cannot be corrupted or directly altered from the outside.

### 📖 The Story
You are working on the core banking module of a digital bank. In financial applications, security and data integrity are everything: account balances must never be directly modified from outside code, and invalid operations—such as depositing negative amounts or withdrawing more money than available—must be strictly prevented.

### 🛠 What You Need to Build (Your Tasks)
1. **Create `BankAccount.java`**:
   - Model an account holding an account number, owner name, and balance.
   - Enforce that balance changes can **only** happen through validated deposit and withdrawal methods.
2. **Create `Main.java`**:
   - Test your class by performing valid and invalid banking operations, verifying that invalid actions are safely rejected.

### 📁 Suggested Project Structure
```text
exercise-1-bank-account/
└── src/
    ├── BankAccount.java
    └── Main.java
```

### 📋 Class Specification: `BankAccount`

#### Variables:
- `String accountNumber`: Unique identifier for the account (immutable after creation).
- `String ownerName`: Full name of the account holder.
- `double balance`: Current balance of the account.

#### Methods & Responsibilities:
- **Constructor**: Initializes account details. Validates that the starting balance cannot be negative (defaults to `0.0` with an error message if invalid).
- **`getAccountNumber`**: Returns the account number.
- **`getOwnerName`**: Returns the owner's name.
- **`setOwnerName`**: Updates the owner's name with non-blank validation.
- **`getBalance`**: Returns the current balance. *(Do NOT provide a direct `setBalance` method!)*
- **`deposit`**: Deposits funds into the account, ensuring that only positive amounts are accepted.
- **`withdraw`**: Withdraws funds from the account, ensuring the requested amount is positive and does not exceed available funds.
- **`displayAccountInfo`**: Prints the account number, owner name, and current balance in a readable format.

> [!IMPORTANT]
> **Don't forget to maintain encapsulation!**

### 🧪 Verification (`Main.java`)
In `Main.java`, verify your implementation with these exact steps:
1. Create an account for `"Alice"` with account number `"ACC-101"` and starting balance `$1,000`.
2. Attempt to deposit a negative amount (e.g. `-$200`) ➔ verify it is rejected with an error.
3. Deposit `$500` ➔ verify balance becomes `$1,500`.
4. Attempt to withdraw `$2,000` (exceeding balance) ➔ verify it is rejected with an error.
5. Withdraw `$300` ➔ verify it succeeds.
6. Call `displayAccountInfo()` ➔ confirm final balance is `$1,200`.

---

## 📌 Exercise 2: Employee & Payroll System

### 🎯 Objective
Learn how to use **Inheritance** (`extends`) to share common code across classes, call parent constructors with `super`, override methods to customize behavior for subclasses, and use **Polymorphism** to process different types of objects uniformly.

### 📖 The Story
A company employs different types of staff: full-time employees who receive a fixed salary along with benefits (performance bonuses and healthcare allowances), and part-time contractors who are paid strictly by the hour. Managing diverse contracts in spreadsheets has led to calculation errors and duplicated effort.

### 🛠 What You Need to Build (Your Tasks)
1. **Create `Employee.java` (Base Class)**:
   - Holds shared attributes (ID, name, base salary) and common behavior.
2. **Create `FullTimeEmployee.java` (Subclass)**:
   - Inherits from `Employee` and adds salary calculations that include bonuses and healthcare allowances.
3. **Create `PartTimeEmployee.java` (Subclass)**:
   - Inherits from `Employee` and computes earnings based on hours logged and an hourly rate.
4. **Create `Main.java`**:
   - Store different employee types in a single collection and calculate payroll polymorphically.

### 📁 Suggested Project Structure
```text
exercise-2-employee-system/
└── src/
    ├── Employee.java            # Base class
    ├── FullTimeEmployee.java    # Subclass
    ├── PartTimeEmployee.java    # Subclass
    └── Main.java                # Test runner
```

### 📋 Class Specifications

#### 1. Base Class: `Employee`
- **Variables**:
  - `String id`: Unique employee identifier.
  - `String name`: Full name of the employee.
  - `double baseSalary`: Fixed base monthly salary.
- **Methods & Responsibilities**:
  - **Constructor**: Initializes `id`, `name`, and validates that base salary is non-negative.
  - **Getters & Setters**: Controlled access to employee attributes.
  - **`calculateSalary`**: Calculates and returns the employee's monthly earnings (returns base salary for standard employees).
  - **`displayInfo`**: Prints employee ID, name, and total calculated earnings.

---

#### 2. Subclass: `FullTimeEmployee` (extends `Employee`)
- **Variables**:
  - `double bonus`: Monthly performance bonus.
  - `double medicalAllowance`: Monthly healthcare allowance.
- **Methods & Responsibilities**:
  - **Constructor**: Chains to the superclass constructor and initializes bonus and medical allowance.
  - **Getters & Setters**: Controlled access to bonus and allowance fields.
  - **`calculateSalary`**: Overrides salary calculation to factor in additional benefits (bonus and allowance) on top of the base salary.

---

#### 3. Subclass: `PartTimeEmployee` (extends `Employee`)
- **Variables**:
  - `int hoursWorked`: Total hours worked in the pay period.
  - `double hourlyRate`: Payment rate per hour.
- **Methods & Responsibilities**:
  - **Constructor**: Chains to the superclass constructor and sets up hourly details.
  - **Getters & Setters**: Controlled access to hours worked and hourly rate.
  - **`calculateSalary`**: Overrides salary calculation to compute compensation based on logged hours and hourly wage rate.

> [!IMPORTANT]
> **Don't forget to maintain encapsulation!**

### 🧪 Verification (`Main.java`)
In `Main.java`, demonstrate **Polymorphism**:
1. Create an array or list of type `Employee` containing:
   - One standard `Employee` (base salary: `$2,000`).
   - One `FullTimeEmployee` (base salary: `$3,000`, bonus: `$500`, allowance: `$200`).
   - One `PartTimeEmployee` (40 hours, `$25`/hour).
2. Use a single `for` loop to iterate through the array and invoke `displayInfo()` on each employee.
3. Calculate and print the grand total payroll cost for all employees combined.

---

## 📌 Exercise 3: Vehicle Rental Management System

### 🎯 Objective
Design a multi-class system combining **Inheritance**, **Encapsulation**, and **Object Composition**. You will model different types of vehicles and build a central manager class that manages available inventory, processes rentals, and calculates rental costs.

### 📖 The Story
A vehicle rental agency needs a software system to manage its rental fleet (cars and motorcycles). Customers rent vehicles for a number of days, and different vehicle types calculate rental pricing differently:
- **Cars** have a fixed cleaning/insurance fee added to their rental.
- **Motorcycles** offer a discount if rented for a week (7 days) or longer.

The agency needs a central manager to track which vehicles are currently rented, display available vehicles, process customer rentals, and calculate final receipts upon rental.

### 🛠 What You Need to Build (Your Tasks)
1. **Create `Vehicle.java` (Base Class)**:
   - Models a generic vehicle with rental status tracking.
2. **Create `Car.java` and `Motorcycle.java` (Subclasses)**:
   - Inherit from `Vehicle` and specialize the rental cost calculation.
3. **Create `RentalAgency.java` (System Manager)**:
   - Manages a collection of vehicles (Object Composition), handles renting and returning, and prevents renting already-rented vehicles.
4. **Create `Main.java`**:
   - Simulate a full rental and return workflow.

### 📁 Suggested Project Structure
```text
exercise-3-rental-system/
└── src/
    ├── Vehicle.java             # Base vehicle class
    ├── Car.java                 # Subclass
    ├── Motorcycle.java          # Subclass
    ├── RentalAgency.java        # System manager (Fleet management)
    └── Main.java                # Simulation runner
```

---

### 📋 Class Specifications

#### 1. Base Class: `Vehicle`
- **Variables**:
  - `String licensePlate`: Unique license plate (e.g. `"ABC-123"`).
  - `String model`: Vehicle make and model (e.g. `"Toyota Corolla"`).
  - `double dailyRate`: Standard rental rate per day.
  - `boolean isRented`: Flag indicating if the vehicle is currently rented out (defaults to `false`).
- **Methods & Responsibilities**:
  - **Constructor**: Initializes license plate, model, and daily rate. Sets `isRented = false`.
  - **Getters**: Provide getters for all fields.
  - **`rentVehicle`**: Sets `isRented = true`.
  - **`returnVehicle`**: Sets `isRented = false`.
  - **`calculateRentalCost`**: Takes `int days` and returns `dailyRate * days`. (Designed to be overridden in subclasses).
  - **`displayDetails`**: Prints plate, model, daily rate, and whether it is currently available or rented.

---

#### 2. Subclass: `Car` (extends `Vehicle`)
- **Variables**:
  - `int numberOfSeats`: Number of passenger seats.
- **Methods & Responsibilities**:
  - **Constructor**: Calls `super(...)` and initializes `numberOfSeats`.
  - **Getters & Setters**: Accessor for `numberOfSeats`.
  - **`calculateRentalCost`**: Overrides rental cost calculation to add a fixed service/insurance fee to the total daily cost.
  - **`displayDetails`**: Overrides parent method to display car details along with number of seats.

---

#### 3. Subclass: `Motorcycle` (extends `Vehicle`)
- **Variables**:
  - `boolean hasHelmetIncluded`: Whether a helmet is provided.
- **Methods & Responsibilities**:
  - **Constructor**: Calls `super(...)` and initializes `hasHelmetIncluded`.
  - **Getters & Setters**: Accessor for `hasHelmetIncluded`.
  - **`calculateRentalCost`**: Overrides rental cost calculation to apply a promotional discount for long-term rentals (e.g. 7 days or more).
  - **`displayDetails`**: Overrides parent method to display motorcycle details along with helmet status.

---

#### 4. Manager Class: `RentalAgency` (System Design)
- **Variables**:
  - `String agencyName`: Name of the rental agency.
  - `List<Vehicle> fleet`: Collection of vehicles managed by the agency.
- **Methods & Responsibilities**:
  - **Constructor**: Initializes `agencyName` and initializes `fleet` as an empty list (e.g. `new ArrayList<>()`).
  - **`addVehicle`**: Adds a `Vehicle` to the agency's fleet.
  - **`displayAvailableVehicles`**: Displays details for all vehicles in the fleet that are currently available for rent.
  - **`rentVehicle`**: Searches for a vehicle by license plate and rents it if available, calculating the total cost and generating a rental confirmation. If the vehicle is already rented or not found, rejects the request with an error.
  - **`returnVehicle`**: Searches for a rented vehicle by license plate and processes its return, restoring its availability. Handles cases where the vehicle was not found or was not rented.

> [!IMPORTANT]
> **Don't forget to maintain encapsulation!**
---

### 🧪 Verification (`Main.java`)
In `Main.java`, simulate the complete agency workflow:
1. Create a `RentalAgency` named `"City Wheels"`.
2. Add a `Car` (e.g. `"Toyota Camry"`, rate: `$50`/day, `5` seats) and a `Motorcycle` (e.g. `"Yamaha MT-07"`, rate: `$30`/day, helmet: `true`).
3. Display all available vehicles.
4. Rent the car for `3` days ➔ verify that the calculated cost factors in the extra service fee and the car is marked as rented.
5. Attempt to rent the **same car again** ➔ verify the system rejects it because it is already rented.
6. Return the car ➔ verify it is successfully returned and appears in the available list again.

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
