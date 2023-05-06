package JAVA;

public class inheritance {
    static class P {
        int d = 1;
        int d1 = 10;

        void fun() {
            System.out.println("P fun");
        }

        void fun1() {
            System.out.println("p fun1");
        }

    }

    static class C extends P {
        int d = 2;
        int d2 = 20;

        void fun() {
            System.out.println("C fun");
        }

        void fun2() {
            System.out.println("C fun2");
        }
    }

    public static void main(String[] args) {

        // CASE 1.
        P obj = new P();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        obj.fun();
        obj.fun1();
        System.out.println();

        // CASE 2.
        C obj1 = new C();
        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        System.out.println(obj1.d2);
        obj1.fun();
        obj1.fun1();
        obj1.fun2();
        System.out.println();

        // CASE 3.
        P obj2 = new C(); // At COMPILE TIME class P (refernce) and at RUN TIME class C (Object/Instance).
        System.out.println(obj2.d); // gives the output of P class.
        System.out.println(obj2.d1);
        // System.out.println(obj2.d2);-> gives compile time error.
        System.out.println(((C) obj2).d2); // can be accessed by Typecasting.
        obj2.fun();// gives output of class P.
        obj2.fun1();
        // obj2.fun2(); -> Not Allowed because compiler gives error.
        ((C) obj2).fun2(); // can be accessed by Typecasting.

        // CASE 4.
        // C obj3 = new P(); -> NOT ALLOWED...
    }
}
