


## 📚 Overview

This project covers One-to-One mappings across different domains:

- 👨‍🎓 **Student ↔ AadhaarCard** – Identity mapping  
- 🧑‍💼 **Employee ↔ Company** – Organizational mapping  
- 👩‍🏫 **Teacher ↔ Subject** – Academic planning

Each model is fully implemented using `@OneToOne` annotation and includes all essential CRUD operations.

---

## 🛠️ Tech Stack

| Tool        | Description                  |
|-------------|------------------------------|
| ☕ Java      | Backend language              |
| 🐘 Hibernate| ORM Framework                 |
| 🧩 JPA       | Annotations & Mappings       |
| 🗄️ MySQL / H2 | Relational Databases         |
| 📦 Maven     | Build & Dependency Management|

---

## 🧬 Entity Relationships

### 👨‍🎓 Student ↔ AadhaarCard
Every student has one AadhaarCard. Used for identity linking in educational systems.

### 🧑‍💼 Employee ↔ Company  
Each employee belongs to one company. Useful in HR or payroll systems.

### 👩‍🏫 Teacher ↔ Subject  
Every teacher teaches one core subject. Represents curriculum assignment.

---

## 📂 Folder Structure

```
src/
├── model/          # Entity classes
├── controller/     # Business logic & CRUD
└── configuration/  # Hibernate setup
```

---

## 🚀 Getting Started

1. 📥 Clone the repository  
2. ⚙️ Configure `hibernate.cfg.xml`  
3. ▶️ Run main methods from controllers to test mappings

---

## ✅ Key Features

- 🔐 Realistic domain modeling  
- 💡 Clear use of `@OneToOne`, `@JoinColumn`, and cascading  
- 🧪 Includes Create, Read, Update, Delete operations  
- 🔄 Easy to expand into more complex relationships

---

## 🎯 Learning Outcomes

Understand how real-world relationships can be mapped using Hibernate. Ideal for:

- Students exploring ORM fundamentals  
- Developers building enterprise-grade applications  
- Projects requiring clean domain modeling

---

## 🤝 Contribution

Feel free to open issues, suggest enhancements, or submit pull requests. Collaboration is welcome!
