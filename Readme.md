# Linked List Management System

This is my Java project for practising linked lists. It has a console menu where I can try the same operations on a singly linked list and a doubly linked list, then compare how they work.

## What the program does

The program lets me insert and delete values, search for a value, update it, display the list, count nodes, find the maximum, minimum or middle value, reverse the list, sort it, and remove duplicates. The doubly linked list can be displayed in both directions.

The values are integers, including zero and negative numbers. Positions start at 1. If the list has an even number of nodes, the middle operation returns the second middle node. For example, the middle of `10 -> 20 -> 30 -> 40` is `30`.

After an operation, the program prints its expected time complexity and a short reason. For example, adding to the end of the singly linked list takes O(n), because it has to find the last node. Adding to the end of the doubly linked list takes O(1), because it keeps a tail reference.

## Example displays

Singly linked list:

```text
[HEAD] -> [10] -> [20] -> [30] -> NULL
```

Doubly linked list, forward and backward:

```text
NULL <- [10] <-> [20] <-> [30] -> NULL
NULL <- [30] <-> [20] <-> [10] -> NULL
```

## Project files

```text
Linked-List-Management-System/
├── src/
│   ├── Main.java
│   ├── SinglyLinkedList.java
│   └── DoublyLinkedList.java
├── sample-output/
│   └── output.txt
├── docs/
│   └── project-report.md
├── README.md
└── .gitignore
```

`Main.java` contains the menus and reads input using `Scanner`. The other two Java files contain the linked list methods. Both lists use custom Node classes; Java's built-in list classes are not used.

## How to run

This project uses Java and has no external dependencies. Open the project folder in VS Code, then open a terminal at the project root and run:

```sh
javac -d out src/*.java
java -cp out Main
```

If VS Code does not recognise Java files, install the Extension Pack for Java. The program can then be started from `src/Main.java` with the Run button, or from the terminal commands above.

## Time complexity

`n` means the number of nodes. Search-based operations include the time used to find the target node.

| Operation                                    | Singly linked list | Doubly linked list |
| -------------------------------------------- | -----------------: | -----------------: |
| Insert at beginning / delete from beginning  |               O(1) |               O(1) |
| Insert at end                                |               O(n) |               O(1) |
| Insert at position, before or after a value  |               O(n) |               O(n) |
| Delete at end, position or by value          |               O(n) |               O(n) |
| Search / update                              |               O(n) |               O(n) |
| Display / count / maximum / minimum / middle |               O(n) |               O(n) |
| Reverse                                      |               O(n) |               O(n) |
| Bubble sort                                  |  O(n²) worst case |  O(n²) worst case |
| Remove duplicates                            |             O(n²) |             O(n²) |

The doubly linked list stores both `head` and `tail`. Each node also has `prev` and `next` references, so it uses more memory per node than the singly linked list. Position-based insertion still takes O(n), since the program traverses the list to find the position.



SAMPLE OUTPUT

![1792838453866](image/Readme/1792838453866.png)
