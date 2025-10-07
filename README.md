# 🌀 Comparable vs Comparator in Java (Naruto Edition)

A fun yet educational Java project to clearly understand the difference between **Comparable** and **Comparator** interfaces — explained through **Naruto’s Tailed Beasts** ⚡.

---

## 🧩 Overview

This project demonstrates how sorting works in Java using:
- `Comparable` → defines **default sorting** logic inside a class.
- `Comparator` → defines **custom sorting** logic externally.

To make the concept engaging, I represented each **Tailed Beast** (from the Naruto anime) as an object, sorted by:
- Tail Number (default)
- Beast Name
- Owner
- Village
- Tail Number (Descending)

---

## 💡 Key Concepts Covered

| Concept | Description |
|----------|--------------|
| **Comparable** | Used for natural sorting. Implemented using `compareTo()` inside the class. |
| **Comparator** | Used for multiple or custom sorting orders. Implemented using `compare()` outside the class. |
| **Collections.sort()** | Demonstrates sorting both via Comparable and Comparator. |
| **Object-Oriented Programming** | Uses encapsulation, getters/setters, and custom classes. |

---

## 🧠 Example Classes

### 1️⃣ `Naruto.java`
Represents each Tailed Beast with properties:
```java
private int tailBeast;
private String tailBeastName;
private String owner;
private String village;


2️⃣ Comparator Classes

SortByTail

SortByTailDescending

SortByTailBeastName

SortByOwner

SortByVillage

Each defines a different sorting rule using compare().

🧾 Sample Output
✅ Sorted by Comparable (Tail Number Ascending)
✅ Sorted by Tail Beast Name
✅ Sorted by Owner
✅ Sorted by Village
✅ Sorted by Tail Number (Descending)

🖼️ Visualization

I created a LinkedIn infographic to visualize this concept:

🎨 Comparable vs Comparator in Java – Explained with Naruto’s Tailed Beasts
View LinkedIn Post Here
 (Add link to your actual post)

🧰 Tech Stack

Language: Java

IDE: IntelliJ IDEA / Eclipse

Concepts: OOP, Interfaces, Collections Framework, Custom Sorting

🧑‍💻 Author

Nandakishore Dharalingam
