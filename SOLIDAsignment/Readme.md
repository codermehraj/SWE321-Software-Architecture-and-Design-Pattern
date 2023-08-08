# SOLID Principle
## Online shop

This is a simple dummy code for implementing SOLID Principle for an online shop
# Single Responsibility
Each class should have only one reason to change.
My classes like:
- Product class: Responsible for representing product information.
- Cart class: Responsible for managing items in the user's cart.
- Order class: Responsible for handling the checkout process.
Each class has a single responsibility, making it easier to manage and maintain the codebase.

# Single Responsibility
Each class should have only one reason to change.
My classes like:
- Product class: Responsible for representing product information.
- Cart class: Responsible for managing items in the user's cart.
- Order class: Responsible for handling the checkout process.
Each class has a single responsibility, making it easier to manage and maintain the codebase.

# Open-Close Principle
Software entities (classes, modules, functions) should be open for extension but closed for modification.
I have an abstract PaymentMethod class:

- PaymentMethod class: An abstract class with methods like processPayment().
Then, created concrete classes that extend PaymentMethod:
- CreditCardPayment class: Implements PaymentMethod for credit card payments.
- BkashPayment class: Implements PaymentMethod for Bkash payments.


# Liskov Substitution Principle (LSP)
Subtypes must be substitutable for their base types without affecting program correctness.
In our case, `CreditCardPayment`, `BkashPayment` & `PaymentMethod` all 3 of the classes are substitutable 


# Interface Segregation Principle (ISP)
Clients should not be forced to depend on interfaces they do not use.
We have an Users who use email, phone number etc. But all users may not have a email, 
So for making a notification system, We won't force user to implement both of email
notification system and SMS notification system
Our user Depends on EmailSender and SMSNotifier.
we can have separate interfaces:
- EmailSender interface: Contains sendEmail() method.
- SMSNotifier interface: Contains sendSMS() method.

This way, User only depends on the specific interfaces it needs.
For example `Gmail` user depends only on `EmailSender` interface.

# Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.

I have an Interface named `OrderProcessor`:

- OrderProcessor interface: Defines methods like processOrder().

Concrete classes can implement this interface:
- OnlineOrderProcessor class: Implements OrderProcessor for online orders.
- InStoreOrderProcessor class: Implements OrderProcessor for in-store orders.

This way, high-level modules (order processing) depend on abstractions (interfaces) rather than specific implementations.
