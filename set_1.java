// 3 marks question hai set 1 code only

// Write a Java Program Using Interface.

// interface Demo {
// void show();
// }

// class Test implements Demo {

// public void show() {
// System.out.println("Interface Example");
// }

// public static void main(String[] args) {
// Test t = new Test();
// t.show();
// }
// }

// Java Program Demonstrating Multilevel Inheritance

// class Vehicle {
// void show() {
// System.out.println("this is a Vechicle");
// }
// }

// class car extends Vehicle {
// void start() {
// System.out.println("car is starting");
// }

// }

// class Cngcar extends car {
// void gas() {
// System.out.println("Cng car is charging");
// }
// }

// class Main {
// public static void main(String[] args) {

// Cngcar c = new Cngcar();

// c.show();

// }
// }

// Q8. Write a Java Program Using throws Keyword. (3 Marks)

// class Demo {

// static void test() throws ArithmeticException {
// throw new ArithmeticException("Error");
// }

// public static void main(String[] args) {
// test();
// }
// }

// Q10. Write a Java Program Using HashSet. (3 Marks)

// HashSet is a class in Java that stores unique elements (no duplicates
// allowed).
// It is part of the Java Collections Framework and uses a hash table internally
// for fast storage and retrieval.

// import java.util.HashSet;

// class main {
// public static void main(String[] args) {

// HashSet<String> hs = new HashSet<>();

// hs.add("java");
// hs.add("python");

// System.out.println(hs);
// }
// }

// difference betwween paratmeterized and default

// class student {

// student() {
// System.out.println("default constructor");
// }
// student(String name) {
// System.out.println("paramterized constructor");
// }
// public static void main(Stirng[] args){

// student s1 = new student();
// student s2 = new student(rahul);
// }
// }

// class divide {
// public static void main(String[] args){

// try {
// int a = 10/0;

// }

// catch(ArithmeticException e){

// System.out.println("division by zero not allowed");

// }

// finally {

// System.out.println("program continous");
// }
// }
// }

// Abstraction hides implementation details and shows only essential
// information.

// It is achieved using abstract class or interface.

// Program

// class abstract shape {
// abstract void draw();

// }
// class circle extends shape {
// void draw(){

// System.out.println("draw a circle");
// }
// }
// class Main {
// public static void main(String[] args){

// circle c = new circle();

// c.draw();
// }
// }

// polymorphism
// Polymorphism means one method with many forms..

// it has two types :-

// 1.method overloading

// class Mathoperation {

// void add (int a, int b){

// System.out.println(a+b);
// }
// void add (int a, int b, int c){
// System.out.println(a+b+c);

// }
// public static void main(String[] args){

// Mathoperation m = new Mathoperation();

// m.add(19,38);
// m.add(12,67,89);
// }
// }

// 2.method overrriding

// class Animal {
// void sound(){
// System.out.println("animal makes sound");
// }
// }
// class dog extends Animal {

// void sound(){
// System.out.println("dog barks");
// }
// }
// class cat extends Animal {

// void sound(){
// System.out.println("cat meows");
// }
// }
// public class Animal {
// public static void main(String[] args){

// Animal a = new Animal();
// a.sound();

// dog d = new dog();
// d.sound();

// cat c = new cat();
// c.sound();

// }
// }

// Inheritance
// Definition

// Inheritance is the process by which one class acquires the properties and
// methods of another class using the extends keyword.

// class Person {

// void walk(){
// System.out.println("person walking");
// }
// }

// class suresh extends Person {

// void eat(){
// System.out.println("suresh mango eating");
// }

// }

// class Main {

// public static void main(String[] args){

// suresh s = new suresh();

// s.eat();
// s.walk();
// }
// }

// Encapsulation
// Definition

// Encapsulation is the process of wrapping data and methods into a single unit
// (class) and protecting data using private variables.

// class Student {

// private int age;

// public void setAge(int age){
// this.age = age;
// }

// public int getAge() {
// return age;

// }

// public static void main(String[] args){

// Student s = new Student();

// s.setAge(19);

// System.out.println("Age : "+ s.getAge());

// }
// }
