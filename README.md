# HealthMerge Patient Record Merger

## Overview

This project solves a linked list problem for a healthcare company called HealthMerge Inc.

Two healthcare providers, HealthMerge and CarePlus, each store patient records in separate linked lists sorted by SSN numbers. The goal of this project is to merge both sorted linked lists into one sorted linked list while preserving all patient records, including duplicates.

This project demonstrates:
- Linked list manipulation
- Two-pointer techniques
- Efficient merging algorithms
- Time and space complexity optimization

---

# Problem Statement

Given the heads of two sorted linked lists representing patient records sorted by SSN numbers, merge them into a single sorted linked list.

## Requirements
- Maintain sorted order
- Preserve duplicates
- Reuse existing nodes
- Do not lose patient data

---

# Technologies Used

- Java
- VS Code
- Java JDK 26

---

# Project Structure

```plaintext
HealthMergeProject/
│
├── src/
│   ├── ListNode.java
│   ├── MergePatientRecords.java
│   └── Main.java
│
└── README.md
```

---

# Files Description

## ListNode.java

Defines the linked list node structure for patient records.

Each node stores:
- SSN
- Full name
- Age
- Pointer to the next node

---

## MergePatientRecords.java

Contains:
- The merge algorithm
- Print helper function

Uses a two-pointer approach to efficiently merge both sorted lists.

---

## Main.java

Driver program used for:
- Creating test linked lists
- Running the merge function
- Displaying results

---

# How to Run the Project

## Step 1: Compile

```bash
javac src\*.java
```

## Step 2: Run

```bash
java -cp src Main
```

---

# Example Output

```plaintext
===== HEALTH MERGE DEMO =====

1001 -> 1002 -> 1005 -> 1006 -> null
```

---

# Algorithm Explanation

The solution uses:
- A dummy node
- Two pointers

## Steps
1. Compare current SSN values from both lists
2. Attach the smaller node to the merged list
3. Move the corresponding pointer
4. Continue until one list ends
5. Attach remaining nodes

This guarantees the final list remains sorted.

---

# Test Cases

# Normal Cases

## Test Case 1

### Input
```plaintext
1001 -> 1005
1002 -> 1006
```

### Output
```plaintext
1001 -> 1002 -> 1005 -> 1006
```

---

## Test Case 2

### Input
```plaintext
1001 -> 1003 -> 1005
1003 -> 1004 -> 1006
```

### Output
```plaintext
1001 -> 1003 -> 1003 -> 1004 -> 1005 -> 1006
```

---

## Test Case 3

### Input
```plaintext
1001 -> 1002 -> 1003
2001 -> 2002
```

### Output
```plaintext
1001 -> 1002 -> 1003 -> 2001 -> 2002
```

---

# Edge Cases

## Edge Case 1

### Input
```plaintext
null
1001 -> 1002
```

### Output
```plaintext
1001 -> 1002
```

---

## Edge Case 2

### Input
```plaintext
null
null
```

### Output
```plaintext
empty list
```

---

## Edge Case 3

### Input
```plaintext
1005
1002
```

### Output
```plaintext
1002 -> 1005
```

---

# Time and Space Complexity

## Time Complexity

```plaintext
O(n + m)
```

Where:
- n = length of the first list
- m = length of the second list

Each node is visited exactly once.

---

## Space Complexity

```plaintext
O(1)
```

No additional linked lists or arrays are created.  
The algorithm reuses existing nodes.

---

# Optimization Discussion

This solution is already optimal because:
- Every node must be processed at least once
- Pointer manipulation avoids unnecessary memory allocation

Alternative approaches using new node creation would increase space complexity.

---

# Author

Denniz Garza
