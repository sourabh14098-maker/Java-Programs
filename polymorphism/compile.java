// package polymorphism;

// class MathOperation {
//     int add(int a, int b) {
//         return a + b;
//     }

//     int div(int a, int b, int c) {
//         return a / b / c;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         MathOperation m = new MathOperation();

//         System.out.println(m.add(2, 4));
//         System.out.println(m.div(5, 4, 3));
//         System.out.println(m.add(2.3, 4.3));
//     }
// }

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a / b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double div(double a, double b) {
        return a - b;
    }

}

class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(3, 4));

        System.out.println(c.sub(5, 7));

        System.out.println(c.mul(8, 9));

        System.out.println(c.add(4.6, 6.7));

        System.out.println(c.div(4.6, 3.2));
    }
}