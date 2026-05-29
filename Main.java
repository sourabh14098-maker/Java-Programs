// public // types of consturctors

// 1 default constructors
// 2 parameterized constructors
// 3 copy constructors
// 4 private Constructors

// optional
// 5 Overloaded Constructors
// 6 No arguement Constructors

// 1 [default() constructors]
// class Student {
// String name;
// int age;
//
// void display() {
// System.out.println("Name: " + name);
// System.out.println("Age: " + age);
// }
// }
//
// public class Main { // main class started (Main should be your file Name)
// public static void main(String[] args) {
// Student s = new Student();// creating object of student class
// // Since we did not write any constructor,
// // Java automatically calls a hidden default constructor:
// s.display();
// }
// }

// 2 Parametrized Constructors (takes values as parameters)

// program 1

// class Student {
// String name;
// int age;
//
// Student(String n, int a) { // parameterized constructor created
// name = n;
// age = a;
// // we can also use this.name = name ,this.age = age
// //this means current object
// }
// void display() {
// System.out.println("Name: " + name);
// System.out.println("Age: " + age);
// }
// }
// public class Main {
// public static void main(String[] args) {
// Student s = new Student("Sameer", 18);
// s.display();
// }
// }

// program 2 {Employee}
// class Employee {
// String name;
// int salary;
//
// Employee(String name, int salary) {
// this.name = name;
// this.salary = salary;
// }
//
// void display() {
// System.out.println("Employee Name: " + this.name);
// System.out.println("Employee Salary: " + this.salary);
// }
// }
//
// public class Main {
// public static void main(String[] args) {
// Employee e = new Employee("Rahul", 50000);
// e.display();
// }
// }

// program 3 (bank details program hard)
// class BankAccount {
// String accountHolderName;
// int accountNumber;
// double balance;
//
// BankAccount(String accountHolderName, int accountNumber, double balance) {
// this.accountHolderName = accountHolderName;
// this.accountNumber = accountNumber;
// this.balance = balance;
// }
//
// void deposit(double amount) {
// this.balance = this.balance + amount;
// }
//
// void withdraw(double amount) {
// if (amount <= this.balance) {
// this.balance = this.balance - amount;
// } else {
// System.out.println("Insufficient Balance");
// }
// }
//
// void displayAccountDetails() {
// System.out.println("-------------------------");
// System.out.println("Account Holder Name: " + this.accountHolderName);
// System.out.println("Account Number: " + this.accountNumber);
// System.out.println("Current Balance: " + this.balance);
// System.out.println("-------------------------");
// }
// }

// public class Main {
// public static void main(String[] args) {
// BankAccount account1 = new BankAccount("Sameer", 101, 5000);
// BankAccount account2 = new BankAccount("Rahul", 102, 10000);
//
// account1.deposit(2000);
// account1.withdraw(1500);
//
// account2.withdraw(3000);
// account2.deposit(1000);
//
// account1.displayAccountDetails();
// account2.displayAccountDetails();
// }
// }

// 3 COPY CONSTRUCTORS (Copies values from one object to another object)

// program 1 [ easy ]
// class Student {
// String name;
// int age;
//
// Student(String n, int a) {
// name = n;
// age = a;
// }
//
// Student(Student oldStudent) {
// name = oldStudent.name;
// age = oldStudent.age;
// }
//
// void display() {
// System.out.println("Name: " + name);
// System.out.println("Age: " + age);
// }
// }
//
// public class Main {
// public static void main(String[] args) {
// Student s1 = new Student("Sameer", 18);
//
// Student s2 = new Student(s1);
//
// s1.display();
// s2.display();
// }
// }

// Program 2 [easy + medium]
//
// class Laptop {
// String brand;
// int ram;
// double price;
//
// // Parameterized constructor
// Laptop(String brand, int ram, double price) {
// this.brand = brand;
// this.ram = ram;
// this.price = price;
// }
//
// // Copy constructor
// Laptop(Laptop oldLaptop) {
// this.brand = oldLaptop.brand;
// this.ram = oldLaptop.ram;
// this.price = oldLaptop.price;
// }
//
// void display() {
// System.out.println("Brand: " + this.brand);
// System.out.println("RAM: " + this.ram + " GB");
// System.out.println("Price: " + this.price);
// System.out.println("----------------------");
// }
// }
//
// public class Main {
// public static void main(String[] args) {
//
// // Object l1 is created with the help of using parameterized constructor
// Laptop l1 = new Laptop("HP", 16, 55000);
//
// // Object l2 is created by copying values from l1
// Laptop l2 = new Laptop(l1);
//
// l1.display();
// l2.display();
// }
// }

///// program 3 (Animal class example ) [easy]
// class Animal {
// String name;
// String sound;
//
// // Parameterized constructor
// Animal(String name, String sound) {
// this.name = name;
// this.sound = sound;
// }
//
// // Copy constructor
// Animal(Animal oldAnimal) {
// this.name = oldAnimal.name;
// this.sound = oldAnimal.sound;
// }
//
// void display() {
// System.out.println("Animal Name: " + this.name);
// System.out.println("Animal Sound: " + this.sound);
// System.out.println("----------------");
// }
// }
//
// public class Main {
// public static void main(String[] args) {
// // First object created by pass the value in the constructors
// Animal a1 = new Animal("Dog", "Bark");
//
// // Second object created by copying a1 (oldAnimal copy the first animal
// attributes)
// Animal a2 = new Animal(a1);
//
// a1.display();
// a2.display();
// }
// }

// // 4 private constructors
// class MathHelper {

// private MathHelper() {
// System.out.println("Object creation not allowed");
// }

// static int add(int a, int b) {// static method belongs to the class, not to
// an object
// return a + b;
// }
// static int multiply(int a, int b) {
// return a * b;
// }
// }

// public class Main {
// public static void main(String[] args) {

// // We can call static methods directly using class name
// int sum = MathHelper.add(10, 20);

// int product = MathHelper.multiply(5, 4);

// System.out.println("Sum: " + sum);
// System.out.println("Product: " + product);

// // MathHelper obj = new MathHelper(); // This will give error because
// constructor is private
// }
// }

// optionals

// 5 Overloaded constructors

// programm 1 (student class)
// class Student {
// String name;
// int age;

// Student() {
// name = "Unknown person we dont know ";
// age = 0;
// }

// Student(String n) {
// name = n;
// age = 0;
// }

// Student(String n, int a) {
// name = n;
// age = a;
// }

// void display() {
// System.out.println("Name: " + name);
// System.out.println("Age: " + age);
// }
// }

// public class Main {
// public static void main(String[] args) {
// Student s1 = new Student();
// Student s2 = new Student("Sameer");
// Student s3 = new Student("Rahul", 20);

// s1.display();
// s2.display();
// s3.display();
// }
// }

// program 2
// overloaded constructors
//
// class Student {
// String name;
// int age;
//
// // Constructor 1 No-Argument Constructor
// // It has no parameters
// Student() {
// name = "Unknown person ";
// age = 0;
// }
//
// // Constructor 2 {Parameterized Constructor}
// // It has one parameter
// Student(String n) {
// name = n;
// age = 0;
// }
//
// // Constructor 3 [ Parameterized Constructor]
// // It has two parameters
// Student(String n, int a) {
// name = n;
// age = a;
// }
//
// void display() {
// System.out.println("Name: " + name);
// System.out.println("Age: " + age);
// System.out.println("----------------");
// }
// }
//
// public class Main {
// public static void main(String[] args) {
//
// // Calls Constructor 1: Student()
// Student s1 = new Student();
//
// // Calls Constructor 2: Student(String n)
// Student s2 = new Student("Sameer");
//
// // Calls Constructor 3: Student(String n, int a)
// Student s3 = new Student("Rahul", 20);
//
// s1.display();
// s2.display();
// s3.display();
// }

// }
