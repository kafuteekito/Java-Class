# Java-Class
# Book, Plant and Smartphone Java Class Project

This repository contains simple Java classes that simulate various entities such as a **Book**, a **Plant**, and a **Smartphone**. The code was written and organized using **IntelliJ IDEA** and added to this repository through different branches to maintain version control and track changes.

## Overview of Classes

### 1. **Book.java**
- **Attributes**: 
  - `title` (String): The title of the book.
  - `author` (String): The author of the book.
  - `price` (int): The price of the book in dollars.
  - `year` (int): The year the book was published.

- **Constructors**:
  - Default constructor: Initializes the book with default values (No Title, No Author, 0 price, and 0 year).
  - Parameterized constructor: Allows creating a book with specified values for all attributes.

- **Methods**:
  - `displayInfo()`: Prints detailed information about the book.

### 2. **Plant.java**
- **Attributes**: 
  - `species` (String): Represents the species of the plant.
  - `height` (float): The height of the plant in meters.
  - `sunlightRequirement` (String): Describes the amount of sunlight the plant needs (e.g., Full Sun, Partial Shade).
  - `plantType` (String): The general type of plant (e.g., Shrub, Tree, Root Vegetable).

- **Methods**:
  - `grow(float growthAmount)`: Simulates the growth of the plant by increasing its height.
  - `displayInfo()`: Prints out detailed information about the plant.

### 3. **Smartphone.java**
- **Attributes**:
  - `model` (String): The model of the smartphone.
  - `brand` (String): The manufacturer of the smartphone.
  - `memorySize` (int): The memory size of the smartphone in gigabytes (Gb).
  - `price` (int): The price of the smartphone in som.
  - `batteryCapacity` (int): The battery capacity in milliampere-hours (mAh).
  - `screenSize` (double): The diagonal size of the smartphone's screen in inches.
  - `camera` (int): The camera resolution in megapixels (MP).

- **Constructors**:
  - Default constructor: Initializes the smartphone with default values (No Information).
  - Parameterized constructor: Allows creating a smartphone with specified values for all attributes.

- **Methods**:
  - `displayInfo()`: Displays detailed specifications about the smartphone.

## How to Find the Code

Each class was added through **IntelliJ IDEA** and can be found in different branches of this repository. Here’s how you can locate each one:

- **Book Class**: Available in the `master` branch.
- **Plant Class**: Available in the `plant` branch.
- **Smartphone Class**: Available in the `smartphone` branch.

You can switch between these branches to explore the specific implementations of each class.
