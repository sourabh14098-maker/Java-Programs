// 3 marks question hai set 1 code only 

//  Write a Java Program Using Interface.

// interface Demo {
//     void show();
// }

// class Test implements Demo {

//     public void show() {
//         System.out.println("Interface Example");
//     }

//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();
//     }
// }

//  Java Program Demonstrating Multilevel Inheritance

// class Vehicle {
//     void show() {
//         System.out.println("this is a Vechicle");
//     }
// }

// class car extends Vehicle {
//     void start() {
//         System.out.println("car is starting");
//     }

// }

// class Cngcar extends car {
//     void gas() {
//         System.out.println("Cng car is charging");
//     }
// }

// class Main {
//     public static void main(String[] args) {

//         Cngcar c = new Cngcar();

//         c.show();

//     }
// }

// Q8. Write a Java Program Using throws Keyword. (3 Marks)

class Demo {

    static void test() throws ArithmeticException {
        throw new ArithmeticException("Error");
    }

    public static void main(String[] args) {
        test();
    }
}
