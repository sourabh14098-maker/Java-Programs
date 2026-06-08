package experiments_java;
//1 . write a java program to display hello world

// class helloworld {
// public static void main(String[] agrs) {

// System.out.println("hello world");
// }
// }

//  2 .// Create a class Student with attributes like name, roll number, and grade. Write methods
// to input and display details of a student.

// import java.util.Scanner;

// class Student {
//     String name;
//     int roll;
//     char grade;

//     void input() {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter name");        name = sc.nextLine();

//         System.out.println("Enter roll");
//         roll = sc.nextInt();

//         System.out.println("Enter grade");
//         grade = sc.next().charAt(0);
//     }

//     void display() {
//         System.out.println("\nStudent Details");
//         System.out.println("NAME : " + name);
//         System.out.println("ROLL : " + roll);
//         System.out.println("GRADE : " + grade);
//     }

//     public static void main(String[] args) {
//         Student s = new Student();

//         s.input();
//         s.display();
//     }
// }

// 3.  Demonstrate default constructor and parameterized constructors using a class
// Rectangle that calculates area.

// class Rectangle {
//     int length, breadth;

//     Rectangle() {
//         length = 5;
//         breadth = 4;

//     }

//     Rectangle(int l, int b) {
//         length = l;
//         breadth = b;
//     }

//     void area() {
//         System.out.println("Area = " + (length * breadth));
//     }

//     public static void main(String[] args) {

//         Rectangle r1 = new Rectangle();
//         Rectangle r2 = new Rectangle(10, 8);

//         System.out.println("using default constructor");
//         r1.area();

//         System.out.println("using parameterized");
//         r2.area();
//     }
// }

// 4. Write a Java program to show method overloading for calculating area of different
// shapes (circle, rectangle, triangle).

// class Area {

//     void area(double r) {
//         System.out.println("Area of Circle = " + (3.14 * r * r));
//     }

//     void area(int l, int b) {
//         System.out.println("Area of Rectangle = " + (l * b));
//     }

//     void area(int b, int h, int x) {
//         System.out.println("Area of Triangle = " + (0.5 * b * h));
//     }

//     public static void main(String[] args) {

//         Area a = new Area();

//         a.area(5.0); // Circle
//         a.area(10, 6); // Rectangle
//         a.area(8, 4, 1); // Triangle
//     }
// }

// 5. Create a base class Person and a derived class Employee. Add relevant attributes and
// display method. Demonstrate inheritance.

// class Person {

//     String name;
//     int age;

//     void getPerson(String n, int a) {
//         name = n;
//         age = a;
//     }
// }

// class Employee extends Person {

//     int empId;
//     double salary;

//     void getEmployee(int id, double sal) {
//         empId = id;
//         salary = sal;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Employee ID: " + empId);
//         System.out.println("Salary: " + salary);
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Employee e = new Employee();

//         e.getPerson("Rahul", 25);
//         e.getEmployee(101, 50000);

//         e.display();
//     }
// }

// Create classes Vehicle, Car (extends Vehicle), and ElectricCar (extends Car).
// Demonstrate multilevel inheritance.

class Vehicle {
    void sound() {
        System.out.println("Vehicle drive");
    }
}

class Car extends Vehicle {
    void sound() {
        System.out.println("Car is start");
    }
}

class ElectricCar extends Car {
    void sound() {
        System.out.println("Electric Car is charging");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        ElectricCar e = new ElectricCar();

        v.sound();
        c.sound();
        e.sound();
    }
}
