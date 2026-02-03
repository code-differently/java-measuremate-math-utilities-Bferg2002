[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zDyQNhLG)
# MeasureMate — Math Utilities

You are building a mini suite of real-world utilities using Java’s `Math` class.

## Rules
- No starter code is provided. You write everything from scratch.
- Each assignment must be its own Java class with a `main` method.
- Your programs must compile and run.
- Output must be clearly labeled and readable.

## Submission
Create a folder named `src/` and place your `.java` files inside it: If src is already there, you do not have to create it

src/
- TipTaxCalculator.java

## Recommended workflow
1) Read assignment 01, build it, run it
2) Commit


---

## 🔀 Branching Requirement (Important)

You must complete your work **on your own branch**, not on `main`.

### Why we do this

* This is how real teams work
* It protects the `main` branch
* It makes your work easier to review

---

## Step 1: Create Your Branch

From the project root, open the terminal and run:

```bash
git checkout -b yourname-math-practice
```

**Example:**

```bash
git checkout -b coreye-math-practice
```

This creates a new branch **and switches you to it**.

---

## Step 2: Confirm You’re on the Right Branch

Run:

```bash
git branch
```

You should see a `*` next to your branch name:

```
* coreye-math-practice
  main
```

If you see `main` starred, you are on the wrong branch.

---

## Step 3: Do ALL Your Work on This Branch

* Create your `src` folder
* Create your Java files
* Write and test your code
* Commit your changes

Example commit:

```bash
git add .
git commit -m "Complete Math practice assignments"
```

---

## Step 4: Push Your Branch to GitHub

```bash
git push -u origin yourname-math-practice
```

After this, your branch will appear on GitHub.

---

## ⚠️ Important Rules

* Do **NOT** commit directly to `main`
* Do **NOT** delete your branch
* Do **NOT** rename your branch after pushing

---

# MeasureMate — Tip & Tax Calculator (Java)

This project is a beginner-friendly Java application that simulates a **real-world restaurant bill calculator**.
You will collect user input, perform calculations using methods, and format output clearly.

The goal is to practice:

* Using `Scanner` for user input
* Writing and calling your own methods
* Working with return values
* Using the Java `Math` class correctly
* Structuring code the way real developers do

---

## Learning Objectives

By completing this project, you will be able to:

* Collect numeric input from a user using `Scanner`
* Create custom `static` methods outside of `main`
* Pass data into methods using parameters
* Return values from methods and use them in `main`
* Apply percentage math correctly
* Use `Math.round()` to round numeric values
* Organize Java code for readability and reuse

---

## Project Overview

You will build a console-based **Tip & Tax Calculator**.

The program will:

1. Ask the user for:

   * Bill amount
   * Tax rate (percentage)
   * Tip rate (percentage)
2. Calculate:

   * Tax amount
   * Tip amount
   * Total bill
3. Round the final total to the nearest whole dollar
4. Display all results with clear labels

---

## Project Structure

Your project must include:

```
src/
└── TipTaxCalculator.java
```

* The class name **must match the file name**
* All Java files must be placed inside the `src` folder
* The `src` folder must be marked as a **Sources Root** in IntelliJ

---

## Method Requirements (Very Important)

This project is designed to move you away from writing all logic in `main`.

### You MUST:

* Create **multiple custom methods** outside of `main`
* Call those methods from `main`
* Ensure your methods:

  * Accept parameters
  * Return values
* Keep `main` responsible for:

  * User input
  * Calling methods
  * Printing results

### Example Method Responsibilities

Your program should include methods similar to:

* A method to calculate tax
* A method to calculate tip
* A method to calculate the total bill
* A method to round the total

Each method should do **one clear job**.

---

## Input Requirements

You must use `Scanner` to collect input from the user.

Prompt the user for:

* Bill amount (double)
* Tax rate percentage (double)
* Tip rate percentage (double)

Hard-coded values are **not allowed**.

---

## Math Requirements

You must:

* Perform percentage calculations using:

  ```
  amount * (percent / 100)
  ```
* Use `Math.round()` to round the final total bill
* Store the rounded result in a variable

Reminder:

* `Math.round()` returns a `long`

---

## Output Requirements

Your program must print **all** of the following with clear labels:

* Bill amount
* Tax amount
* Tip amount
* Total bill (raw)
* Total bill (rounded)

Each value should appear on its own line.

---

## Example Interaction (Sample Only)

```
Enter bill amount: 45.50
Enter tax rate (%): 8
Enter tip rate (%): 18

Bill amount: 45.5
Tax amount: 3.64
Tip amount: 8.19
Total (raw): 57.33
Total (rounded): 57
```

Your output may differ depending on user input.

---

### Commit and push your work

```bash
git add .
git commit -m "Complete Tip & Tax Calculator"
git push -u origin yourname-tip-tax
```

---

## What NOT to Do

* Do NOT put all calculations directly inside `main`
* Do NOT hard-code bill values
* Do NOT remove method return values
* Do NOT commit directly to `main`

---

## How This Reflects Real-World Development

This project mirrors professional Java practices:

* `main` acts as the **entry point**
* Business logic lives in methods
* Methods are reusable and testable
* Code is readable and maintainable

This structure prepares you for:

* Larger Java projects
* Team-based development
* Frameworks like Spring Boot

---

## Submission Checklist

Before submitting, confirm:

* [ ] Program compiles and runs
* [ ] Uses `Scanner` for input
* [ ] Uses `Math.round()`
* [ ] Contains multiple custom methods
* [ ] Methods are called from `main`
* [ ] Output is clearly labeled
* [ ] Work is pushed to your own branch

