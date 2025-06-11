# S3.02.Patterns2.Lv1

# 🍕 Pizza Order System using Builder Pattern
### 📄 Description – Exercise Statement
This exercise implements the Builder design pattern to manage the construction of pizza orders with different configurations.

The application is structured around the following components:

Pizza: the product class representing a pizza with size, dough, and toppings.

PizzaBuilder: an interface defining the methods for setting pizza attributes.

Concrete builders: classes like HawaiianPizzaBuilder and VegetarianPizzaBuilder that implement the PizzaBuilder interface.

PizzaMaster: the director class that takes a PizzaBuilder and assembles the pizza.

Main: entry point of the program that demonstrates pizza building.

Summary of the exercise statement:

Develop a pizza order system using the Builder pattern in Java. It should support different pizza types with configurable size, dough, and toppings. Use a PizzaBuilder interface, concrete builders, a PizzaMaster director, and demonstrate it all in a Main class.

### 💻 Technologies Used
### 🧠 Java 17 (or later)

### 🔨 Gradle (project build and dependency management)

### 💡 IntelliJ IDEA as the development environment

### ☕ JDK (Java Development Kit)

### 📦 Java Standard Library

### 🔗 Git and GitHub for version control

### 📋 Requirements
Java 17 or higher installed

IntelliJ IDEA (recommended)

Gradle (bundled with IntelliJ or installed separately)

GitHub account (to clone or fork the repository)

### 🛠️ Installation

Open the project in IntelliJ IDEA:

Go to File > Open... and select the pizza-builder project folder.

Wait for Gradle to sync.

Make sure the correct JDK is set:

File > Project Structure > Project SDK → Java 17+

Build the project via Build > Build Project

### ▶️ Running the Project
Once the project is open in IntelliJ:

Open Main.java.

Click the green Run button (or press Ctrl+Shift+F10) to start the program.

### 🧪 Sample Flow:
Create a HawaiianPizzaBuilder and a VegetarianPizzaBuilder.

Pass them to the PizzaMaster.

The PizzaMaster builds the pizza by calling builder methods in a specific order.

The result is a Pizza object with its properties set.

The pizza is printed or logged to the console.

### 🌐 Deployment
This project is intended for educational/console use only.

If needed, you can generate a .jar file using IntelliJ:

Go to File > Project Structure > Artifacts

Create a new JAR artifact from the Gradle build output

Build it using Build > Build Artifacts

To run the JAR:

```
java -jar pizza-builder.jar
```

### 🤝 Contributing
All contributions are welcome! To contribute:
Marc, Ana, Javier, Ignasi, Alejandro, Vanina, Meritxell.

### 🔗 GitHub Repository
https://github.com/ArnauAsole/S3.02.Patterns2.Lv1.git
