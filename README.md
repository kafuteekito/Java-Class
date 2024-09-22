# Java Book Class Example

This project demonstrates a simple Java implementation for managing book information using classes. It showcases object-oriented programming concepts such as class creation, constructors, and method definitions.

## Overview

The program allows users to create book objects with various attributes, including title, author, price, and publication year. Users can display the details of the books in the collection.

## Classes

### `book`

The `book` class represents a book with the following attributes:

- `title`: A string representing the title of the book.
- `author`: A string representing the author of the book.
- `price`: An integer representing the price of the book in dollars.
- `year`: An integer representing the publication year of the book.

#### Constructors

- **Default Constructor**: Initializes a book with "No Title" for title, "No Author" for author, and 0 for price and year.
- **Parameterized Constructor**: Initializes a book with specified values for title, author, price, and year.

#### Methods

- `displayInfo()`: Prints the book details to the console.

### `Main`

The `Main` class contains the `main` method, which creates instances of the `book` class and displays their information.

## UML Class Diagram

```plaintext
+--------------------------------------------------------------+
|      book                                                    |
+--------------------------------------------------------------+
| - title: String                                              |
| - author: String                                             |
| - price: int                                                 |
| - year: int                                                  |
+--------------------------------------------------------------+
| + book()                                                     |
| + book(title: String, author: String, price: int, year: int) |
| + displayInfo(): void                                        |
+--------------------------------------------------------------+
