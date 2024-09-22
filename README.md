# Java Smartphone Class Example

This project showcases a simple Java implementation for managing smartphone information using classes. It demonstrates object-oriented programming concepts, including class creation, constructors, and method definitions.

## Overview

The program allows users to create smartphone objects with various attributes such as model, brand, memory size, price, battery capacity, screen size, and camera specifications. Users can display the details of the smartphones in the store.

## Classes

### `Smartphone`

The `Smartphone` class represents a smartphone with the following attributes:

- `model`: A string representing the model of the smartphone.
- `brand`: A string representing the brand of the smartphone.
- `memorySize`: An integer representing the memory size in GB.
- `price`: An integer representing the price in local currency (som).
- `batteryCapacity`: An integer representing the battery capacity in mAh.
- `screenSize`: A double representing the screen size in inches.
- `camera`: An integer representing the camera resolution in megapixels.

#### Constructors

- **Default Constructor**: Initializes a smartphone with "No Information" for model and brand, and 0 for all numeric attributes.
- **Parameterized Constructor**: Initializes a smartphone with specified values for model, brand, memory size, price, battery capacity, screen size, and camera.

#### Methods

- `displayInfo()`: Prints the smartphone details to the console.

### `Main`

The `Main` class contains the `main` method, which creates instances of the `Smartphone` class and displays their information.

## UML Class Diagram

```plaintext
+--------------------------------------------------------------------------------------------------------------------------------+
|   Smartphone                                                                                                                   |
+--------------------------------------------------------------------------------------------------------------------------------+
| - model: String                                                                                                                |
| - brand: String                                                                                                                |
| - memorySize: int                                                                                                              |
| - price: int                                                                                                                   |
| - batteryCapacity: int                                                                                                         |
| - screenSize: double                                                                                                           |
| - camera: int                                                                                                                  |
+--------------------------------------------------------------------------------------------------------------------------------+
| + Smartphone()                                                                                                                 |
| + Smartphone(model: String, brand: String, memorySize: int, price: int, batteryCapacity: int, screenSize: double, camera: int) |
| + displayInfo(): void                                                                                                          |
+--------------------------------------------------------------------------------------------------------------------------------+
