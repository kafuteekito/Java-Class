# Java Plant Class Example

This project demonstrates a simple Java implementation for managing plant information using classes. It highlights object-oriented programming concepts such as class creation, constructors, and method definitions.

## Overview

The program allows users to create plant objects with various attributes, including species, height, sunlight requirements, and type. Users can also simulate plant growth and display their details.

## Classes

### `Plant`

The `Plant` class represents a plant with the following attributes:

- `Species`: A string representing the species of the plant.
- `Height`: A double representing the height of the plant in meters.
- `SunlightRequirement`: A string describing the sunlight needs of the plant.
- `Type`: A string indicating the type of the plant (e.g., Flower, Vegetable, Tree).

#### Constructors

- **Default Constructor**: Initializes a plant with "Apple Tree" as the species, 6 meters in height, "Full Sun" for sunlight requirement, and "Tree" as the type.
- **Parameterized Constructor**: Initializes a plant with specified values for species, height, sunlight requirement, and type.

#### Methods

- `grow(double Amount)`: Increases the plant's height by the specified amount and prints a message indicating the growth.
- `displayInfo()`: Prints the plant details to the console.

### `Main`

The `Main` class contains the `main` method, which creates instances of the `Plant` class, demonstrates plant growth, and displays their information.

## UML Class Diagram

```plaintext
+-------------------------------------------------------------------------------------+
|     Plant                                                                           |
+-------------------------------------------------------------------------------------+
| - Species: String                                                                   |
| - Height: double                                                                    |
| - SunlightRequirement: String                                                       |
| - Type: String                                                                      |
+-------------------------------------------------------------------------------------+
| + Plant()                                                                           |
| + Plant(Species: String, Height: double, SunlightRequirement: String, Type: String) |
| + grow(Amount: double): void                                                        |
| + displayInfo(): void                                                               |
+-------------------------------------------------------------------------------------+
