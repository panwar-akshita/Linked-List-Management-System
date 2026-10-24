
# Project Report: Linked List Management System

## 1. Aim

To develop a menu-driven Java application that implements Singly Linked Lists and Doubly Linked Lists using custom nodes.

## 2. Objectives

- Implement common linked list operations.
- Understand node connections and traversal.
- Compare singly and doubly linked list structures.
- Analyse the time complexity of operations.
- Handle invalid input and common edge cases.

## 3. Tools and Technologies

- Programming language: Java
- IDE: Visual Studio Code
- Concepts: Data Structures, Object-Oriented Programming and Algorithms

## 4. Introduction

A linked list is a linear data structure made up of nodes. Each node stores data and one or more references to other nodes. Linked lists allow dynamic insertion and deletion without requiring contiguous memory locations.

A Singly Linked List stores a reference to the next node. A Doubly Linked List stores references to both the previous and next nodes.

## 5. Project Design

### Main.java

Provides the main menu, accepts user input, calls linked list operations and displays expected time complexity.

### SinglyLinkedList.java

Implements the singly linked list using custom nodes connected through next references.

### DoublyLinkedList.java

Implements the doubly linked list using custom nodes connected through prev and next references. It supports forward and backward traversal.

## 6. Operations

- Insert at beginning, end and a specified position
- Insert before or after a target value
- Delete from beginning, end, position or by value
- Search and update values
- Display and count nodes
- Find maximum, minimum and middle elements
- Reverse and sort the list
- Remove duplicate values
- Display the doubly linked list in both directions

## 7. Time Complexity Analysis

Let n be the number of nodes.

| Operation           | Singly Linked List | Doubly Linked List |
| ------------------- | ------------------ | ------------------ |
| Insert at beginning | O(1)               | O(1)               |
| Insert at end       | O(n)               | O(1)               |
| Search              | O(n)               | O(n)               |
| Display and count   | O(n)               | O(n)               |
| Reverse             | O(n)               | O(n)               |
| Bubble sort         | O(n²) worst case  | O(n²) worst case  |
| Remove duplicates   | O(n²)             | O(n²)             |

The exact complexity depends on the implementation and the references maintained by the list.

## 8. Testing

Test the program with:

- Empty lists and lists containing one node
- Positive, zero and negative integers
- Invalid positions
- Values that do not exist
- Duplicate values
- Reverse and sorting operations
- Forward and backward traversal

Record the actual results after running these tests.

## 9. Result

The application demonstrates common operations on singly and doubly linked lists through a menu-driven Java console interface.

## 10. Conclusion

This project provides practical experience with linked list implementation, node references, traversal, insertion, deletion and time complexity analysis.

## 11. References

- Java Documentation: https://docs.oracle.com/en/java/
- Data Structures and Algorithms course materials
