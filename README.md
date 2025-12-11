# SOLID Principles in Java  
This repository contains clean and simple Java examples demonstrating all five SOLID principles.  
Each principle has its own folder with an isolated, easy-to-understand code sample.

---

## 📘 What Are SOLID Principles?
SOLID is a set of five software design principles that help developers write maintainable, scalable, and flexible code.  
They are widely used in professional backend development, especially in Java and Spring Boot projects.

---

# 🧱 1. Single Responsibility Principle (SRP)
*A class should have only one reason to change.*

### ✔ Example
- `User` class → holds data  
- `UserRepository` → handles saving data  
- `EmailService` → sends email  
Each class does only one job.

📂 Path: `src/srp/`

---

# 🧱 2. Open/Closed Principle (OCP)
*Classes should be open for extension, but closed for modification.*

### ✔ Example
`PaymentService` can work with any payment type:  
- `CreditCardPayment`  
- `PayPalPayment`  

You add new payment types **without modifying** existing code — only extend it.

📂 Path: `src/ocp/`

---

# 🧱 3. Liskov Substitution Principle (LSP)
*Subclasses must be substitutable for their base classes.*

### ✔ Example
`Sparrow` extends `Bird` and behaves correctly.  
There is **no broken behavior**, like throwing exceptions in overridden methods.

📂 Path: `src/lsp/`

---

# 🧱 4. Interface Segregation Principle (ISP)
*A client should not depend on methods it does not use.*

### ✔ Example
Separated interfaces:  
- `Workable`  
- `Eatable`  

`Human` uses both, `Robot` uses only one.  
No unnecessary methods.


---

# 🧱 5. Dependency Inversion Principle (DIP)
*Depend on abstractions, not concretions.*

### ✔ Example
`NotificationService` depends on the interface `MessageSender`, not concrete classes.  
You can plug in `EmailSender`, `SmsSender`, etc.



