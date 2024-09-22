# Java-Class
# Book, Plant and Smartphone Java Class Project

This repository contains simple Java classes that simulate various entities such as a **Book**, a **Plant**, and a **Smartphone**. The code was written and organized using **IntelliJ IDEA** and added to this repository through different branches to maintain version control and track changes.

## Overview of Classes

### 1. **Book.java**
- **Attributes**: 
  - `title` (String): The title of the book (e.g., "The Book of Bill").
  - `author` (String): The author of the book (e.g., "Alex Hirsch").
  - `price` (int): The price of the book in dollars (e.g., 27).
  - `year` (int): The year the book was published (e.g., 2024).

- **Constructors**:
  - Default constructor: Initializes the book with default values (No Title, No Author, 0 price, and 0 year).
  - Parameterized constructor: Allows creating a book with specified values for all attributes.

- **Methods**:
  - `displayInfo()`: Prints detailed information about the book.

### 2. **Plant.java**
- **Attributes**: 
  - `species` (String): Represents the species of the plant (e.g., *Rosa chinensis* for a rose).
  - `height` (float): The height of the plant in meters.
  - `sunlightRequirement` (String): Describes the amount of sunlight the plant needs (e.g., Full Sun, Partial Shade).
  - `plantType` (String): The general type of plant (e.g., Shrub, Tree, Root Vegetable).

- **Methods**:
  - `grow(float growthAmount)`: Simulates the growth of the plant by increasing its height.
  - `displayInfo()`: Prints out detailed information about the plant.

### 3. **Smartphone.java**
- **Attributes**:
  - `brand` (String): The manufacturer or model of the smartphone (e.g., Apple, Samsung).
  - `screenSize` (float): The diagonal size of the smartphone's screen in inches.
  - `batteryCapacity` (int): The battery capacity in milliampere-hours (mAh).
  - `operatingSystem` (String): The OS that the smartphone runs (e.g., Android, iOS).

- **Methods**:
  - `displayInfo()`: Displays information about the smartphone's specifications.

### 4. **Main.java**
- **Purpose**: 
  - Acts as the entry point of the program, demonstrating the creation of `Book`, `Plant`, and `Smartphone` objects and calling their methods to display information.
  - Simulates the growth of plants using the `grow()` method and showcases different smartphone models and books.

## How to Find the Code

Each class was added through **IntelliJ IDEA** and can be found in different branches of this repository. Here’s how you can locate each one:

- **Book Class**: Available in the `master` branch.
- **Plant Class**: Available in the `plant` branch.
- **Smartphone Class**: Available in the `smartphone` branch.

You can switch between these branches to explore the specific implementations of each class.
