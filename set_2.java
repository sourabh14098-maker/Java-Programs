// MODULE – 3: Advanced Object-Oriented Concepts

// 1. Constructors in Java
// Definition

// A constructor is a special method that is automatically called when an object
// is created. It is used to initialize the object's data members.

// Characteristics
// Constructor name must be the same as the class name.
// It has no return type.
// It is called automatically when an object is created.

// types of constructor :-
// 1.default
// 2.parameterized
// 3.copy
// 4.private

// 1.Default
// Takes no parameters.
// Initializes objects with default or user-defined values.

// class Student {

// Student(){
// System.out.println("default constructor");
// }
// }public class Main {
// public static void main(String[] args){

// Student s = new Student();

// }
// }

// 2.parameterized
// Takes parameters (arguments).
// Used to initialize objects with different values.

// class Student {

// String name;
// int age;

// Student(String n, int a) {

// name = n;
// age = a;
// }
// void display (){
// System.out.println("Name : "+ name);
// System.out.println("Age : "+ age);
// }
// }
// public class Main {
// public static void main(String[] args){

// Student s1 = new Student("sourabh",39);
// s1.display();
// }
// }

// 3.Copy Constructor (User-Defined)

// Java does not have a built-in copy constructor, but we can create one
// ourselves by passing an object of the same class.

// class Student {
// String name;
// int age;

// Student(String n, int a){
// name = n;
// age = a;
// }
// Student(Student s) {
// name = s.name;
// age = s.age;
// }
// void display() {
// System.out.println(name + " "+ age);
// }
// }
// public class Main {
// public static void main(String[] args){

// Student s1 = new Student("rahul",39);
// Student s2 = new Student(s1);

// s2.display();

// }
// }

// Method Overloading

// Definition

// Method Overloading means having multiple methods with the same name but
// different parameters in the same class.

// class Mathoperation {

// void add(int a, int b){
// System.out.println(a+b);
// }

// void add(int a, int b, int c){
// System.out.println(a+b+c);

// }

// public static void main(String[] args){

// Mathoperation m = new Mathoperation();

// m.add(20,10);
// m.add(4,5,3);
// }
// }

// Method Overriding

// Definition
// Method Overriding occurs when a child class provides its own implementation
// of a method already defined in the parent class.

// class Animal {

// void sound() {
// System.out.println("Animal Sound");
// }
// }

// class Dog extends Animal {

// void sound() {
// System.out.println("Dog Barks");
// }
// }

// class Main {

// public static void main(String[] args) {

// Dog d = new Dog();

// d.sound();
// }
// }

// Abstract Class

// Definition
// An abstract class is declared using the abstract keyword.

// It cannot be instantiated and may contain abstract and normal methods.

// abstract class Shape {

// abstract void draw();
// }

// class Circle extends Shape {

// void draw() {

// System.out.println("Drawing Circle");
// }
// }

// class Main {

// public static void main(String[] args) {

// Circle c = new Circle();

// c.draw();
// }
// }

// Interface

// Definition
// An Interface is a blueprint of a class that contains abstract methods.

// A class implements an interface using the implements keyword.

// interface Bank {

// void deposite();
// void withdraw();
// }
// class SBI implements Bank {

// public void deposit() {
// System.out.println("sbi deposit");
// }

// public void withdraw() {
// System.out.println("sbi withdraw");

// }
// }
// class AXIS implements Bank {
// public void deposit(){
// System.out.println("axis deposit");

// }
// public void withdraw(){
// System.out.println("axis withdraw");

// }
// }
// class Main {
// public static void main(String[] args){

// SBI s = new SBI();

// s.deposit();
// s.withdraw();
// }
// }

// MODULE – 4: Exception Handling and File I/O (Detailed Notes)

// try Block

// Definition
// The try block contains code that may generate an exception.

// class Main {
// public static void main(String[] args){
// try {
// int a = 10/0;

// System.out.println(a);
// }
// }
// }

// catch Block

// Definition
// The catch block handles the exception generated in the try block.

// class Main {

// public static void main(String[] args){

// try {
// int a = 10 / 0;

// }

// catch(ArithmeticException e) {
// System.out.println("division by zero is not allowed");
// }
// }
// }

// 4. try-catch Program

// class Main {
//     public static void main(String[] args){

//         int a = 10;
//         int b = 0;

//         try {
//             int c = a / b;

//             System.out.println(c);

//         }

//         catch(ArithmeticException e){
//             System.out.println("cannot divide by zero");

//         }

//     }
// }

// finally Block

// Definition
// The finally block always executes whether an exception occurs or not.

// class Main {
//     public static void main(String[] args){

//         try {
//             int a = 10 / 0;

//         }
//         catch(ArithmeticException e) {
//             System.out.println("divison by zero is not allowed");

//         }
//         finally {
//             System.out.println("operation completed");

//         }
//     }
// }

// hrow Keyword

// Definition
// The throw keyword is used to explicitly create and throw an exception.

// class Main {
//     public static void main(String[] args) {

//         throw new ArithmeticException("custom exception");
//     }
// }

// throws Keyword

// Definition
// The throws keyword is used in the method declaration to indicate that a method may throw an exception.

// class Demo {
//     static void test() throws ArithmeticException  {

//         throw new   ArithmeticException("Error");

//     }
//     public static void main(String[] args){

//         test();
//     }
// }

// MODULE – 5: Java Collections and Advanced Topics

//  List Interface

// Definition
// A List is an ordered collection that allows duplicate elements.

// import java.util.*;

// class Main {

//     public static void main(String[] args) {

//         ArrayList<String> list = new ArrayList<>();

//         list.add("Java");
//         list.add("Python");
//         list.add("C++");

//         System.out.println(list);
//     }
// }

// LinkedList

// Definition
// LinkedList stores elements using nodes connected by links.

// import java.util.LinkedList;

// class Main {
//     public static void main(String[] args) {

//         LinkedList<String> list = new LinkedList<>();

//         list.add("python");
//         list.add("java");
//         list.add("c++");

//         System.out.println(list);
//     }
// }

// Set Interface

// Definition
// Set is a collection that does not allow duplicate elements.

import java.util.HashSet;

class Main {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("maths");
        set.add("javascript");

        System.out.println(set);

    }
}